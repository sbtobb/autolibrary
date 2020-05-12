package com.cyouguang.autolibrary.controller;

import com.cyouguang.autolibrary.dto.StatusMessageDTO;
import com.cyouguang.autolibrary.entity.BookInfo;
import com.cyouguang.autolibrary.entity.BookTag;
import com.cyouguang.autolibrary.entity.OrderMaster;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.service.DeviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "设备端")
public class DeviceController {
    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @ApiOperation(value = "设备上线")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "deviceId", value = "设备ID", required = true, paramType = "path")
    })
    @GetMapping("/online")
    public StatusMessagePojo online(int deviceId){
        return deviceService.online(deviceId);
    }

    @ApiOperation(value = "设备下线")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "deviceId", value = "设备ID", required = true, paramType = "path")
    })
    @GetMapping("/offline")
    public StatusMessagePojo offline(int deviceId){
        return deviceService.online(deviceId);
    }

    @ApiOperation(value = "创建订单")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "deviceId", value = "设备ID", required = true, paramType = "path")
    })
    @GetMapping("/createOrder")
    public StatusMessageDTO createOrder(int deviceId){
        OrderMaster orderMaster = deviceService.createOrder(deviceId);
        return new StatusMessageDTO(orderMaster);
    }

    @ApiOperation(value = "添加图书")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "orderId", value = "订单 ID", required = true, paramType = "path"),
            @ApiImplicitParam(dataType = "String", name = "tag", value = "电子标签", required = true, paramType = "path")
    })
    @GetMapping("/addProduct")
    public StatusMessagePojo addProduct(int orderId,String tag){
        return deviceService.addProduct(orderId,tag);
    }

    @ApiOperation(value = "获取到订单信息")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "orderId", value = "订单 ID", required = true, paramType = "path")
    })
    @GetMapping("/getOrderMaster")
    public StatusMessageDTO getOrderMaster(int orderId){
        OrderMaster orderMaster = deviceService.getOrderMaster(orderId);
        if (orderMaster == null){
            return new StatusMessageDTO(500,"服务器错误，请求失败",null);
        }
        return new StatusMessageDTO(200,"请求成功",orderMaster);
    }

    @ApiOperation(value = "归还书籍")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "tag", value = "电子标签", required = true, paramType = "path")
    })
    @GetMapping("/borrowBook")
    StatusMessagePojo borrowBook(String tag){
        return deviceService.borrowBook(tag);
    }
    @ApiOperation(value = "取出图书标签信息")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "tag", value = "电子标签", required = true, paramType = "path")
    })
    @GetMapping("/getBookTag")
    public StatusMessageDTO getBookTag(String tag){
        BookTag bookTag = deviceService.getBookTag(tag);
        return new StatusMessageDTO(bookTag);
    }
    @ApiOperation(value = "取出图书信息")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "bookInfoId", value = "图书信息id", required = true, paramType = "path")
    })
    @GetMapping("/getBookInfo")
    public StatusMessageDTO getBookInfo(int bookInfoId){
        BookInfo bookInfo = deviceService.getBookInfo(bookInfoId);
        return new StatusMessageDTO(bookInfo);
    }
}
