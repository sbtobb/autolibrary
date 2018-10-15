package com.cyouguang.autolibrary.controller;

import com.cyouguang.autolibrary.dto.StatusMessageDTO;
import com.cyouguang.autolibrary.entity.OrderMaster;
import com.cyouguang.autolibrary.entity.UserAccount;
import com.cyouguang.autolibrary.entity.UserBook;
import com.cyouguang.autolibrary.entity.UserInfo;
import com.cyouguang.autolibrary.pojo.RegisterPojo;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.service.UserService;
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
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

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

    @PostMapping("/register")
    public StatusMessagePojo register(@RequestBody RegisterPojo registerPojo) {
        return userService.register(registerPojo.getLoginName(),registerPojo.getPassword(),registerPojo.getName(),registerPojo.getGender(),registerPojo.getEmail());
    }

    @GetMapping("/getListUserBook")
    public StatusMessageDTO getListUserBook(HttpSession session) {
        Object sessionUserId = session.getAttribute("UserID");
        if (sessionUserId == null) {
            return new StatusMessageDTO(null);
        }
        return new StatusMessageDTO(userService.getListUserBook((int)sessionUserId));
    }

    @GetMapping("/getUserAccount")
    public StatusMessageDTO getUserAccount(String loginName) {
        return new StatusMessageDTO(userService.getUserAccount(loginName));
    }

    @GetMapping("/getUserInfo")
    public StatusMessageDTO getUserInfo(HttpSession session) {
        Object sessionUserId = session.getAttribute("UserID");
        if (sessionUserId == null) {
            return new StatusMessageDTO(null);
        }
        return new StatusMessageDTO(userService.getUserInfo((int)sessionUserId));
    }

    @GetMapping("/payment")
    public StatusMessagePojo payment(HttpSession session,int orderId) {
        Object sessionUserId = session.getAttribute("UserID");
        if (sessionUserId == null) {
            return new StatusMessagePojo(401,"未登录，支付失败！");
        }
        return userService.payment((int)sessionUserId,orderId);
    }

    @GetMapping("/getOrderMaster")
    public StatusMessageDTO getOrderMaster(int orderId) {
        return new StatusMessageDTO(userService.getOrderMaster(orderId));
    }

    @GetMapping("/getListOrderMaster")
    public StatusMessageDTO getListOrderMaster(HttpSession session) {
        Object sessionUserId = session.getAttribute("UserID");
        if (sessionUserId == null) {
            return new StatusMessageDTO(null);
        }
        return new StatusMessageDTO(userService.getListOrderMaster((int)sessionUserId));
    }
}
