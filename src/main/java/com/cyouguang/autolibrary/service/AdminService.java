package com.cyouguang.autolibrary.service;

import com.cyouguang.autolibrary.pojo.StatusMessagePojo;

/**
 * @author CyouGuang
 * @date 2018/9/17
 */
public interface AdminService {
    /**
     *  登录
     * @param loginName 登录用户名
     * @param password md5加密密码
     * @return StatusMessagePojo 200 登录成功
     */
    StatusMessagePojo login(String loginName, String password);
}
