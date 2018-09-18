package com.cyouguang.autolibrary.service;

import com.cyouguang.autolibrary.entity.OrderMaster;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;

/**
 * @author CyouGuang
 * @date 2018/9/17
 */
public interface DeviceService {
    /**
     * 创建订单
     * @param deviceId 设备id
     * @return OrderMaster
     */
    OrderMaster createOrder(int deviceId);

    /**
     * 添加图书
     * @param orderId 订单id
     * @param tag 图书tag标签
     * @return 状态信息码
     */
    StatusMessagePojo addProduct(int orderId,String tag);

    /**
     * 获取到订单信息
     * @param orderId 订单号码
     * @return 订单信息
     */
    OrderMaster getOrderMaster(int orderId);

    /**
     * 归还书籍
     * @param tag 书籍tag
     * @return 状态信息码
     */
    StatusMessagePojo borrowBook(String tag);

    /**
     * 设备上线
     * @param deviceId 设备id
     * @return 状态信息码
     */
    StatusMessagePojo online(int deviceId);

    /**
     * 设备下线
     * @param deviceId 设备id
     * @return 状态信息码
     */
    StatusMessagePojo offline(int deviceId);
}
