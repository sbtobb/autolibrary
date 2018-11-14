package com.cyouguang.autolibrary.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cyouguang.autolibrary.dao.*;
import com.cyouguang.autolibrary.entity.*;
import com.cyouguang.autolibrary.pojo.BookIsbnPojo;
import com.cyouguang.autolibrary.pojo.ResultPojo;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.pojo.XYPojo;
import com.cyouguang.autolibrary.service.AdminService;
import com.cyouguang.autolibrary.util.HttpUtils;
import com.cyouguang.autolibrary.util.TimeUtil;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.aspectj.weaver.Lint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author CyouGuang
 * @date 2018/9/19
 */
@Service
public class AdminServiceImpl implements AdminService {
    private final AdminAccountMapper adminAccountMapper;
    private final AdminInfoMapper adminInfoMapper;
    private final AdminLoginLogMapper adminLoginLogMapper;
    private final UserInfoMapper userInfoMapper;
    private final BookInfoMapper bookInfoMapper;
    private final BookTagMapper bookTagMapper;
    private final BookBorrowLogMapper bookBorrowLogMapper;
    private final DeviceMasterMapper deviceMasterMapper;
    private final OrderMasterMapper orderMasterMapper;
    private final OrderProductMapper orderProductMapper;
    private final UserLoginLogMapper userLoginLogMapper;

    @Autowired
    public AdminServiceImpl(AdminAccountMapper adminAccountMapper, AdminLoginLogMapper adminLoginLogMapper, UserInfoMapper userInfoMapper, BookInfoMapper bookInfoMapper, BookTagMapper bookTagMapper, BookBorrowLogMapper bookBorrowLogMapper, DeviceMasterMapper deviceMasterMapper, OrderMasterMapper orderMasterMapper, OrderProductMapper orderProductMapper, UserLoginLogMapper userLoginLogMapper,AdminInfoMapper adminInfoMapper) {
        this.adminAccountMapper = adminAccountMapper;
        this.adminLoginLogMapper = adminLoginLogMapper;
        this.userInfoMapper = userInfoMapper;
        this.bookInfoMapper = bookInfoMapper;
        this.bookTagMapper = bookTagMapper;
        this.bookBorrowLogMapper = bookBorrowLogMapper;
        this.deviceMasterMapper = deviceMasterMapper;
        this.orderMasterMapper = orderMasterMapper;
        this.orderProductMapper = orderProductMapper;
        this.userLoginLogMapper = userLoginLogMapper;
        this.adminInfoMapper = adminInfoMapper;
    }

    @Override
    public StatusMessagePojo login(String loginName, String password) {
        if ("".equals(loginName) || "".equals(password)){
            return new StatusMessagePojo(404,"用户名或密码为空");
        }
        AdminAccount adminAccount = getAdminAccount(loginName);
        if (adminAccount == null){
            return new StatusMessagePojo(404,"此用户未注册");
        }

        if (!adminAccount.getPassword().equals(password)) {
            return new StatusMessagePojo(404,"密码不正确");
        }
        //到这里用户名密码已经正确啦
        AdminLoginLog adminLoginLog = new AdminLoginLog();
        adminLoginLog.setAdmin_id(adminAccount.getAdmin_id());
        adminLoginLog.setStatus((byte)1);
        if (adminLoginLogMapper.insertSelective(adminLoginLog) == 0){
            return new StatusMessagePojo(500,"未能正确记录登录日志");
        }
        return new StatusMessagePojo(200,"登录成功");
    }

    @Override
    public AdminAccount getAdminAccount(String loginName) {
        AdminAccountExample adminAccountExample = new AdminAccountExample();
        AdminAccountExample.Criteria criteria = adminAccountExample.createCriteria();
        //添加查询约束条件
        criteria.andLogin_nameEqualTo(loginName);
        List<AdminAccount> adminAccountList = adminAccountMapper.selectByExample(adminAccountExample);
        if (adminAccountList.size() <= 0){
            return null;
        }
        //取出第一条记录
        return adminAccountList.get(0);
    }

    @Override
    public AdminInfo getAdminInfo(int adminId) {
        AdminInfoExample adminInfoExample = new AdminInfoExample();
        AdminInfoExample.Criteria criteria = adminInfoExample.createCriteria();
        criteria.andAdmin_idEqualTo(adminId);
        return adminInfoMapper.selectByExample(adminInfoExample).get(0);
    }

    @Override
    public List<UserInfo> getUserInfoPage(int currentPage, int pageSize) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.setPageInfo(currentPage,pageSize);
        return userInfoMapper.selectByExample(userInfoExample);
    }

    @Override
    public StatusMessagePojo changeIntegral(int userInfoId, double integral) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userInfoId);
        if(userInfo == null){
            return new StatusMessagePojo(404,"未找到该用户");
        }
        userInfo.setIntegral((long)integral);
        if(userInfoMapper.updateByPrimaryKeySelective(userInfo) == 0){
            return new StatusMessagePojo(500,"服务器错误，未能更新数据");
        }
        return new StatusMessagePojo(200,"修改积分成功");
    }

    @Override
    public List<BookInfo> getBookInfoPage(int currentPage, int pageSize) {
        BookInfoExample bookInfoExample = new BookInfoExample();
        bookInfoExample.setPageInfo(currentPage,pageSize);
        return bookInfoMapper.selectByExample(bookInfoExample);
    }

    @Override
    public List<BookTag> getBookTagList(int bookInfoId) {
        BookTagExample bookTagExample = new BookTagExample();
        BookTagExample.Criteria criteria = bookTagExample.createCriteria();
        criteria.andBook_info_idEqualTo(bookInfoId);
        return bookTagMapper.selectByExample(bookTagExample);
    }

    @Override
    public List<BookBorrowLog> getBookBorrowLogPage(int currentPage, int pageSize) {
        BookBorrowLogExample bookBorrowLogExample = new BookBorrowLogExample();
        bookBorrowLogExample.setPageInfo(currentPage,pageSize);
        return bookBorrowLogMapper.selectByExample(bookBorrowLogExample);
    }

    @Override
    public List<DeviceMaster> getDeviceMasterPage(int currentPage, int pageSize) {
        DeviceMasterExample deviceMasterExample = new DeviceMasterExample();
        deviceMasterExample.setPageInfo(currentPage,pageSize);
        return deviceMasterMapper.selectByExample(deviceMasterExample);
    }

    @Override
    public List<OrderMaster> getOrderMaster(int currentPage, int pageSize) {
        OrderMasterExample orderMasterExample = new OrderMasterExample();
        orderMasterExample.setPageInfo(currentPage,pageSize);
        return orderMasterMapper.selectByExample(orderMasterExample);
    }

    @Override
    public List<UserLoginLog> getUserLoginLog(int currentPage, int pageSize) {
        UserLoginLogExample userLoginLogExample = new UserLoginLogExample();
        userLoginLogExample.setPageInfo(currentPage,pageSize);
        return userLoginLogMapper.selectByExample(userLoginLogExample);
    }

    @Override
    public List<OrderProduct> getOrderProduct(int orderId) {
        OrderProductExample orderProductExample = new OrderProductExample();
        OrderProductExample.Criteria criteria = orderProductExample.createCriteria();
        criteria.andOrder_idEqualTo(orderId);
        return orderProductMapper.selectByExample(orderProductExample);
    }

    @Override
    public BookIsbnPojo getBookInfoFromISBN(String isbn) {
        String host = "http://isbn.market.alicloudapi.com";
        String path = "/ISBN";
        String method = "GET";
        String appcode = "dc44c897dfbb48e49f30de6f0ab3d480";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("is_info", "0");
        querys.put("isbn", isbn);
        BookIsbnPojo bookIsbnPojo = null;

        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse httpResponse = HttpUtils.doGet(host, path, method, headers, querys);
            HttpEntity httpEntity = httpResponse.getEntity();
            ResultPojo resultPojo = JSONObject.parseObject(EntityUtils.toString(httpEntity),ResultPojo.class);
            System.out.println(resultPojo);
            bookIsbnPojo = resultPojo.getResult();
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookIsbnPojo;
    }

    @Override
    public StatusMessagePojo addBookWithBookInfo(BookInfo bookInfo) {
        if(checkRepeat(bookInfo.getTitle())){
            //若书本已存在
            return new StatusMessagePojo(500,"该图书已在图书馆中");
        }
        if (bookInfoMapper.insertSelective(bookInfo) == 0){
            return new StatusMessagePojo(500,"服务器错误，新建书籍失败");
        }
        return new StatusMessagePojo(200,"新建书籍成功");
    }

    @Override
    public StatusMessagePojo addBookWithISBN(String isbn) {
        BookIsbnPojo bookIsbnPojo = getBookInfoFromISBN(isbn);
        if (bookIsbnPojo == null || "".equals(bookIsbnPojo.getTitle())){
            //若书名为空时
            return new StatusMessagePojo(500,"isbn有误，无法找到该图书");
        }
        BookInfo bookInfo = new BookInfo();
        bookInfo.setTitle(bookIsbnPojo.getTitle());
        bookInfo.setSubtitle(bookIsbnPojo.getSubtitle());
        bookInfo.setAuthor(bookIsbnPojo.getAuthor());
        bookInfo.setBinding(bookIsbnPojo.getBinding());
        bookInfo.setIsbn(bookIsbnPojo.getIsbn13());
        bookInfo.setIsbn10(bookIsbnPojo.getIsbn10());
        bookInfo.setPic(bookIsbnPojo.getImages_medium());
        bookInfo.setPrice((long)bookIsbnPojo.getPrice());
        bookInfo.setPublisher(bookIsbnPojo.getPublisher());
        bookInfo.setSummary(bookIsbnPojo.getSummary());
        return addBookWithBookInfo(bookInfo);
    }

    /**
     * 通过书名查重
     * @param title 书名
     * @return boolean true 存在重复 false 不存在重复
     */
    private boolean checkRepeat(String title){
        BookInfoExample bookInfoExample = new BookInfoExample();
        BookInfoExample.Criteria criteria = bookInfoExample.createCriteria();
        criteria.andTitleEqualTo(title);
        return bookInfoMapper.selectByExample(bookInfoExample).size() > 0;
    }

    @Override
    public StatusMessagePojo addBookTag(int bookInfoId, String tag) {
        BookTag bookTag = new BookTag();
        bookTag.setBook_info_id(bookInfoId);
        bookTag.setTag(tag);
        if (bookTagMapper.insertSelective(bookTag) == 0){
            return new StatusMessagePojo(500,"服务器错误,添加标签失败");
        }
        return new StatusMessagePojo(200,"添加标签成功");
    }

    @Override
    public double getSaleTotalWithDate(Date beginDate, Date endDate) {
        List<XYPojo> xyPojoList = getSalesWithDate(beginDate,endDate);
        double total = 0;
        for (XYPojo xyPojo:xyPojoList) {
            total += Double.valueOf(xyPojo.getY());
        }
        return total;
    }

    @Override
    public List<XYPojo> getSalesWithDate(Date beginDate, Date endDate) {
        List<XYPojo> xyPojoList = new ArrayList<>();
        // 取到 order_master
        OrderMasterExample orderMasterExample = new OrderMasterExample();
        OrderMasterExample.Criteria criteria = orderMasterExample.createCriteria();
        criteria.andCreate_timeBetween(beginDate,endDate);
        List<OrderMaster> orderMasterList = orderMasterMapper.selectByExample(orderMasterExample);

        SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd");
        if (orderMasterList.size() <= 0){
            return xyPojoList;
        }
        String dateDay = dt.format(orderMasterList.get(0).getCreate_time());
        long total = orderMasterList.get(0).getTotal_price();

        for (int i = 1; i < orderMasterList.size(); i++) {
            OrderMaster orderMaster = orderMasterList.get(i);
            String createDay = dt.format(orderMaster.getCreate_time());
            long totalPrice = orderMaster.getTotal_price();
            if (createDay.equals(dateDay)){
                total += totalPrice;
                //若 到队列尾 添加进队列即可
                if(i == orderMasterList.size()){
                    xyPojoList.add(new XYPojo(dateDay,String.valueOf(total)));
                }
            }else {
                xyPojoList.add(new XYPojo(dateDay,String.valueOf(total)));
                // 判断是否是最后一个数据
                if(i < orderMasterList.size()){
                    dateDay = dt.format(orderMasterList.get(i+1).getCreate_time());
                    total = 0;
                }

            }
        }
        return xyPojoList;
    }

    @Override
    public double getSaleToday() {
        return getSaleWithDate(new Date());
    }
    private double getSaleWithDate(Date date){
        Date beginDate = TimeUtil.setTimeBegin(date);
        Date endDate = TimeUtil.setTimeEnd(date);
        return getSaleTotalWithDate(beginDate,endDate);
    }


    @Override
    public int getVisitorTotalWithDate(Date beginDate, Date endDate) {
        List<XYPojo> xyPojoList = getVisitorsWithDate(beginDate,endDate);
        int total = 0;
        for (XYPojo xyPojo:xyPojoList) {
            total += Double.valueOf(xyPojo.getY());
        }
        return total;
    }

    @Override
    public List<XYPojo> getVisitorsWithDate(Date beginDate, Date endDate) {
        List<XYPojo> xyPojoList = new ArrayList<>();

        UserLoginLogExample userLoginLogExample = new UserLoginLogExample();
        UserLoginLogExample.Criteria criteria = userLoginLogExample.createCriteria();
        criteria.andLog_timeBetween(beginDate,endDate);
        List<UserLoginLog> userLoginLogList = userLoginLogMapper.selectByExample(userLoginLogExample);

        SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd");
        if (userLoginLogList.size() <= 0){
            return xyPojoList;
        }
        String dateDay = dt.format(userLoginLogList.get(0).getLog_time());
        long total = 1;
        for (int i = 1; i < userLoginLogList.size(); i++) {
            UserLoginLog userLoginLog = userLoginLogList.get(i);
            String createDay = dt.format(userLoginLog.getLog_time());
            if (createDay.equals(dateDay)){
                total++;
                //若 到队列尾 添加进队列即可
                if(i == userLoginLogList.size()){
                    xyPojoList.add(new XYPojo(dateDay,String.valueOf(total)));
                }
            }else {
                xyPojoList.add(new XYPojo(dateDay,String.valueOf(total)));
                // 判断是否是最后一个数据
                if(i < userLoginLogList.size()){
                    dateDay = dt.format(userLoginLogList.get(i+1).getLog_time());
                    total = 0;
                }

            }
        }
        return xyPojoList;
    }

    @Override
    public int getVisitorToday() {
        return getVisitorWithDate( new Date());
    }

    private int getVisitorWithDate(Date date){
        Date beginDate = TimeUtil.setTimeBegin(date);
        Date endDate = TimeUtil.setTimeEnd(date);
        return getVisitorTotalWithDate(beginDate,endDate);
    }

    @Override
    public int getPaymentNumberToday() {
        Date date = new Date();
        Date beginDate = TimeUtil.setTimeBegin(date);
        Date endDate = TimeUtil.setTimeEnd(date);
        OrderMasterExample orderMasterExample = new OrderMasterExample();
        OrderMasterExample.Criteria criteria = orderMasterExample.createCriteria();
        criteria.andCreate_timeBetween(beginDate,endDate);
        List<OrderMaster> orderMasterList = orderMasterMapper.selectByExample(orderMasterExample);
        return orderMasterList.size();
    }

    @Override
    public int[] getSalesArrayWeek() {
        int[] salesArray = new int[7];
        Date nowDate = new Date();
        Date preWeekDate = TimeUtil.getPreWeekDate();
        for (int i = 0; preWeekDate.getTime() <= nowDate.getTime() ; preWeekDate = TimeUtil.getNextDay(preWeekDate)) {
            salesArray[i] = (int) getSaleWithDate(preWeekDate);
        }
        return salesArray;
    }

    @Override
    public int[] getVisitorArrayWeek() {
        int[] visitorArray = new int[7];
        Date nowDate = new Date();
        Date preWeekDate = TimeUtil.getPreWeekDate();
        for (int i = 0; preWeekDate.getTime() <= nowDate.getTime() ; preWeekDate = TimeUtil.getNextDay(preWeekDate)) {
            visitorArray[i] = getVisitorWithDate(preWeekDate);
        }
        return visitorArray;
    }
}
