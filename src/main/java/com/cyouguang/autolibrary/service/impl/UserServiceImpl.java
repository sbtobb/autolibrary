package com.cyouguang.autolibrary.service.impl;

import com.cyouguang.autolibrary.dao.*;
import com.cyouguang.autolibrary.entity.*;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CyouGuang
 * @date 2018/9/18
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserAccountMapper userAccountMapper;
    private final UserLoginLogMapper userLoginLogMapper;
    private final UserInfoMapper userInfoMapper;
    private final UserBookMapper userBookMapper;
    private final OrderMasterMapper orderMasterMapper;
    private final OrderProductMapper orderProductMapper;
    private final BookBorrowLogMapper bookBorrowLogMapper;
    private final BookTagMapper bookTagMapper;

    @Autowired
    public UserServiceImpl(UserAccountMapper userAccountMapper, UserLoginLogMapper userLoginLogMapper, UserInfoMapper userInfoMapper, UserBookMapper userBookMapper, OrderMasterMapper orderMasterMapper, OrderProductMapper orderProductMapper, BookBorrowLogMapper bookBorrowLogMapper, BookTagMapper bookTagMapper) {
        this.userAccountMapper = userAccountMapper;
        this.userLoginLogMapper = userLoginLogMapper;
        this.userInfoMapper = userInfoMapper;
        this.userBookMapper = userBookMapper;
        this.orderMasterMapper = orderMasterMapper;
        this.orderProductMapper = orderProductMapper;
        this.bookBorrowLogMapper = bookBorrowLogMapper;
        this.bookTagMapper = bookTagMapper;
    }

    @Override
    public StatusMessagePojo login(String loginName, String password) {
        if ("".equals(loginName) || "".equals(password)){
            return new StatusMessagePojo(404,"用户名或密码为空");
        }
        UserAccountExample userAccountExample = new UserAccountExample();
        UserAccountExample.Criteria criteria = userAccountExample.createCriteria();
        //添加查询约束条件
        criteria.andLogin_nameEqualTo(loginName);

        List<UserAccount> userAccountList = userAccountMapper.selectByExample(userAccountExample);
        if (userAccountList.size() <= 0){
            return new StatusMessagePojo(404,"此用户未注册");
        }
        //取出第一条记录
        UserAccount userAccount = userAccountList.get(0);
        if (!userAccount.getPassword().equals(password)) {
            return new StatusMessagePojo(404,"密码不正确");
        }
        //到这里用户名密码已经正确啦
        UserLoginLog userLoginLog = new UserLoginLog();
        userLoginLog.setUser_id(userAccount.getUser_id());
        userLoginLog.setStatus((byte)1);
        if (userLoginLogMapper.insertSelective(userLoginLog) == 0){
            return new StatusMessagePojo(500,"未能正确记录登录日志");
        }
        return new StatusMessagePojo(200,"登录成功");
    }

    @Override
    public StatusMessagePojo register(String loginName, String password, String name,String gender, String email) {
        //查重
        UserAccountExample userAccountExample = new UserAccountExample();
        UserAccountExample.Criteria criteria = userAccountExample.createCriteria();
        //添加查询约束条件
        criteria.andLogin_nameEqualTo(loginName);

        List<UserAccount> userAccountList = userAccountMapper.selectByExample(userAccountExample);
        if (userAccountList.size() > 0){
            return new StatusMessagePojo(404,"此用户已经被注册");
        }
        //插入 user_account 记录
        UserAccount userAccount = new UserAccount();
        userAccount.setLogin_name(loginName);
        userAccount.setPassword(password);
        if (userAccountMapper.insertSelective(userAccount) == 0){
            return new StatusMessagePojo(500,"服务器错误，创建用户账号失败");
        }

        //插入 user_info 记录
        UserInfo userInfo = new UserInfo();
        userInfo.setUser_id(userAccount.getUser_id());
        userInfo.setGender(gender);
        userInfo.setName(name);
        userInfo.setEmail(email);
        userInfo.setAvatar("");
        userInfo.setIntegral((long)1000);
        if (userInfoMapper.insertSelective(userInfo) == 0){
            return new StatusMessagePojo(500,"服务器错误，创建用户信息失败");
        }
        return new StatusMessagePojo(200,"注册成功");
    }

    @Override
    public List<UserBook> getListUserBook(int userId) {
        UserBookExample userBookExample = new UserBookExample();
        UserBookExample.Criteria criteria = userBookExample.createCriteria();
        criteria.andUser_idEqualTo(userId);
        return userBookMapper.selectByExample(userBookExample);
    }

    @Override
    public UserAccount getUserAccount(String loginName) {
        UserAccountExample userAccountExample = new UserAccountExample();
        UserAccountExample.Criteria criteria = userAccountExample.createCriteria();
        criteria.andLogin_nameEqualTo(loginName);
        List<UserAccount> userAccountList = userAccountMapper.selectByExample(userAccountExample);
        if (userAccountList.size() <= 0){
            return null;
        }
        return userAccountList.get(0);
    }

    @Override
    public UserInfo getUserInfo(int userId) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUser_idEqualTo(userId);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        if(userInfoList.size() <= 0){
            return null;
        }
        return userInfoList.get(0);
    }

    @Override
    public StatusMessagePojo payment(int userId,int orderId) {
        // 取到订单主表
        OrderMaster orderMaster = orderMasterMapper.selectByPrimaryKey(orderId);
        // 取到用户信息表
        UserInfo userInfo = getUserInfo(userId);
        // 判断用户积分是否能够结账
        if (userInfo.getIntegral()<orderMaster.getTotal_price()){
            return new StatusMessagePojo(404,"用户积分不足");
        }
        // 取到用户购买了哪些商品
        OrderProductExample orderProductExample = new OrderProductExample();
        OrderProductExample.Criteria criteria = orderProductExample.createCriteria();
        criteria.andOrder_idEqualTo(orderId);
        List<OrderProduct> orderProductList = orderProductMapper.selectByExample(orderProductExample);

        for (OrderProduct orderProduct:orderProductList) {
            //向 UserBook 插入记录
            UserBook userBook = new UserBook();
            userBook.setUser_id(userId);
            userBook.setBook_info_id(orderProduct.getBook_info_id());
            userBook.setTag(orderProduct.getTag());
            userBook.setTitle(orderProduct.getTitle());
            userBook.setPic(orderProduct.getPic());
            userBookMapper.insertSelective(userBook);

            // 向 BookBorrowLog 插入记录
            BookBorrowLog bookBorrowLog = new BookBorrowLog();
            bookBorrowLog.setBook_info_id(orderProduct.getBook_info_id());
            bookBorrowLog.setTag(orderProduct.getTag());
            bookBorrowLog.setTitle(orderProduct.getTitle());
            bookBorrowLog.setUser_id(userId);
            bookBorrowLog.setStatus((byte)0);
            bookBorrowLogMapper.insertSelective(bookBorrowLog);

            // 更新 BookTag
            BookTag bookTag = new BookTag();
            bookTag.setTag(orderProduct.getTag());
            bookTag.setStatus((byte)0);

            BookTagExample bookTagExample = new BookTagExample();
            BookTagExample.Criteria bookTagExampleCriteria = bookTagExample.createCriteria();
            bookTagExampleCriteria.andTagEqualTo(orderProduct.getTag());

            bookTagMapper.updateByExampleSelective(bookTag,bookTagExample);
        }
        // 处理完所有书籍信息
        orderMaster.setStatus((byte)1);
        if (orderMasterMapper.updateByPrimaryKeySelective(orderMaster) == 0){
            return new StatusMessagePojo(500,"服务器出岔，结算失败");
        }

        return new StatusMessagePojo(200,"结算成功");
    }

    @Override
    public OrderMaster getOrderMaster(int orderId) {
        return orderMasterMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public List<OrderMaster> getListOrderMaster(int userId) {
        OrderMasterExample orderMasterExample = new OrderMasterExample();
        OrderMasterExample.Criteria criteria = orderMasterExample.createCriteria();
        criteria.andUser_idEqualTo(userId);
        return orderMasterMapper.selectByExample(orderMasterExample);
    }
}
