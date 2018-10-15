package com.cyouguang.autolibrary.controller;

import com.cyouguang.autolibrary.dto.StatusMessageDTO;
import com.cyouguang.autolibrary.entity.BookTag;
import com.cyouguang.autolibrary.entity.OrderMaster;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CyouGuang
 * @date 2018/9/17
 */
@RestController
@RequestMapping("/api/device")
public class DeviceController {
    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/online")
    public StatusMessagePojo online(int deviceId){
        return deviceService.online(deviceId);
    }

    @GetMapping("/offline")
    public StatusMessagePojo offline(int deviceId){
        return deviceService.online(deviceId);
    }
    @GetMapping("/createOrder")
    public StatusMessageDTO createOrder(int deviceId){
        OrderMaster orderMaster = deviceService.createOrder(deviceId);
        return new StatusMessageDTO(orderMaster);
    }
    @GetMapping("/addProduct")
    public StatusMessagePojo addProduct(int orderId,String tag){
        return deviceService.addProduct(orderId,tag);
    }
    @GetMapping("/getOrderMaster")
    public StatusMessageDTO getOrderMaster(int orderId){
        OrderMaster orderMaster = deviceService.getOrderMaster(orderId);
        if (orderMaster == null){
            return new StatusMessageDTO(500,"服务器错误，请求失败",null);
        }
        return new StatusMessageDTO(200,"请求成功",orderMaster);
    }
    @GetMapping("/borrowBook")
    StatusMessagePojo borrowBook(String tag){
        return deviceService.borrowBook(tag);
    }
    @GetMapping("/getBookTag")
    public StatusMessageDTO getBookTag(String tag){
        BookTag bookTag = deviceService.getBookTag(tag);
        return new StatusMessageDTO(bookTag);
    }
}
