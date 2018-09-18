package com.cyouguang.autolibrary.service;

import com.cyouguang.autolibrary.entity.OrderMaster;
import com.cyouguang.autolibrary.entity.UserAccount;
import com.cyouguang.autolibrary.entity.UserBook;
import com.cyouguang.autolibrary.entity.UserInfo;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;

import java.util.List;

/**
 * @author CyouGuang
 * @date 2018/9/17
 */
public interface UserService {
    /**
     *  登录
     * @param loginName 登录用户名
     * @param password md5加密密码
     * @return StatusMessagePojo 200 登录成功
     */
    StatusMessagePojo login(String loginName, String password);

    /**
     * 注册
     * @param loginName 登录用户名
     * @param password md5加密密码
     * @param name 真实姓名
     * @param gender 性别
     * @param email 电子邮件
     * @return StatusMessagePojo 200 成功
     */
    StatusMessagePojo register(String loginName, String password,String name,String gender,String email);

    /**
     * 取到用户借阅信息
     * @param userId 用户id
     * @return UserBook列表
     */
    List<UserBook> getListUserBook(int userId);

    /**
     * 取到用户账号表
     * @param loginName 登录用户名
     * @return UserAccount
     */
    UserAccount getUserAccount(String loginName);

    /**
     * 取用户信息表
     * @param userId 用户id
     * @return UserInfo
     */
    UserInfo getUserInfo(int userId);

    /**
     * 结算订单
     * @param userId 用户id
     * @param orderId 订单id
     * @return 200 结算成功
     */
    StatusMessagePojo payment(int userId,int orderId);

    /**
     * 取订单信息
     * @param orderId 订单id
     * @return OrderMaster
     */
    OrderMaster getOrderMaster(int orderId);

    /**
     * 取订单列表
     * @param userId 用户id
     * @return OrderMaster列表
     */
    List<OrderMaster> getListOrderMaster(int userId);
}
