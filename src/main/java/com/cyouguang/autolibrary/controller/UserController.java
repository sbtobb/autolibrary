package com.cyouguang.autolibrary.controller;

import com.cyouguang.autolibrary.dto.StatusMessageDTO;
import com.cyouguang.autolibrary.entity.OrderMaster;
import com.cyouguang.autolibrary.entity.UserAccount;
import com.cyouguang.autolibrary.entity.UserBook;
import com.cyouguang.autolibrary.entity.UserInfo;
import com.cyouguang.autolibrary.pojo.RegisterPojo;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author CyouGuang
 * @date 2018/9/17
 */
@RestController
@RequestMapping("/api/user")
@Api(value = "用户端",description="将参数传入服务器即可")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @ApiOperation(value = "登录")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "loginName", value = "用户名", required = true, paramType = "path"),
            @ApiImplicitParam(dataType = "String", name = "password", value = "密码", required = true, paramType = "path")
    })
    @GetMapping("/login")
    public StatusMessagePojo login(String loginName, String password,HttpSession session) {
        StatusMessagePojo statusMessagePojo = userService.login(loginName,password);
        if (statusMessagePojo.getStatus() > 299){
            return statusMessagePojo;
        }
        Object sessionBrowser = session.getAttribute("UserID");
        int userId = userService.getUserAccount(loginName).getUser_id();
        if (sessionBrowser == null) {
            session.setAttribute("UserID", userId);
        } else {
            System.out.println("存在session，UserID=" + userId);
        }
        return statusMessagePojo;
    }
    @ApiOperation(value = "注册")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "registerPojo", name = "registerPojo", value = "注册用户名", required = true, paramType = "body")
    })
    @PostMapping("/register")
    public StatusMessagePojo register(@RequestBody RegisterPojo registerPojo) {
        return userService.register(registerPojo.getLoginName(),registerPojo.getPassword(),registerPojo.getName(),registerPojo.getGender(),registerPojo.getEmail());
    }
    @ApiOperation(value = "取到用户借阅书籍信息")
    @GetMapping("/getListUserBook")
    public StatusMessageDTO getListUserBook(HttpSession session) {
        Object sessionUserId = session.getAttribute("UserID");
        if (sessionUserId == null) {
            return new StatusMessageDTO(null);
        }
        return new StatusMessageDTO(userService.getListUserBook((int)sessionUserId));
    }
    @ApiOperation(value = "取到用户账号表")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "registerPojo", name = "registerPojo", value = "注册用户名", required = true, paramType = "body")
    })
    @GetMapping("/getUserAccount")
    public StatusMessageDTO getUserAccount(String loginName) {
        return new StatusMessageDTO(userService.getUserAccount(loginName));
    }
    @ApiOperation(value = "取用户信息表")
    @GetMapping("/getUserInfo")
    public StatusMessageDTO getUserInfo(HttpSession session) {
        Object sessionUserId = session.getAttribute("UserID");
        if (sessionUserId == null) {
            return new StatusMessageDTO(null);
        }
        return new StatusMessageDTO(userService.getUserInfo((int)sessionUserId));
    }
    @ApiOperation(value = "结算订单")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "orderId", value = "订单id", required = true, paramType = "path")
    })
    @GetMapping("/payment")
    public StatusMessagePojo payment(HttpSession session,int orderId) {
        Object sessionUserId = session.getAttribute("UserID");
        if (sessionUserId == null) {
            return new StatusMessagePojo(401,"未登录，支付失败！");
        }
        return userService.payment((int)sessionUserId,orderId);
    }
    @ApiOperation(value = "取订单信息")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "orderId", value = "订单id", required = true, paramType = "path")
    })
    @GetMapping("/getOrderMaster")
    public StatusMessageDTO getOrderMaster(int orderId) {
        return new StatusMessageDTO(userService.getOrderMaster(orderId));
    }
    @ApiOperation(value = "取订单列表")
    @GetMapping("/getListOrderMaster")
    public StatusMessageDTO getListOrderMaster(HttpSession session) {
        Object sessionUserId = session.getAttribute("UserID");
        if (sessionUserId == null) {
            return new StatusMessageDTO(null);
        }
        return new StatusMessageDTO(userService.getListOrderMaster((int)sessionUserId));
    }
}
