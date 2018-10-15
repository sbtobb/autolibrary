package com.cyouguang.autolibrary.controller;

import com.cyouguang.autolibrary.dto.StatusMessageDTO;
import com.cyouguang.autolibrary.entity.*;
import com.cyouguang.autolibrary.pojo.LoginPojo;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.pojo.XYPojo;
import com.cyouguang.autolibrary.service.AdminService;
import com.cyouguang.autolibrary.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Past;
import java.util.Date;
import java.util.List;

/**
 * @author CyouGuang
 * @date 2018/9/17
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @RequestMapping("/login")
    public StatusMessagePojo login(@RequestBody LoginPojo loginPojo) {
        if (loginPojo == null){
            return new StatusMessagePojo(404,"账号或密码不能为空");
        }
        System.out.print(loginPojo);
        return adminService.login(loginPojo.getUsername(),loginPojo.getPassword());
    }

    @GetMapping("/getUserInfoPage")
    public StatusMessageDTO getUserInfoPage(int currentPage, int pageSize) {
        return new StatusMessageDTO(adminService.getUserInfoPage(currentPage,pageSize));
    }

    @GetMapping("/changeIntegral")
    public StatusMessagePojo changeIntegral(int userInfoId, double integral) {
        return adminService.changeIntegral(userInfoId,integral);
    }

    @GetMapping("/getBookInfoPage")
    public StatusMessageDTO getBookInfoPage(int currentPage, int pageSize) {
        return new StatusMessageDTO(adminService.getBookInfoPage(currentPage,pageSize));
    }

    @GetMapping("/getBookTagList")
    public StatusMessageDTO getBookTagList(int bookInfoId) {
        return new StatusMessageDTO(adminService.getBookTagList(bookInfoId));
    }

    @GetMapping("/getBookBorrowLogPage")
    public StatusMessageDTO getBookBorrowLogPage(int currentPage, int pageSize) {
        return new StatusMessageDTO(adminService.getBookBorrowLogPage(currentPage,pageSize));
    }

    @GetMapping("/getDeviceMasterPage")
    public StatusMessageDTO getDeviceMasterPage(int currentPage, int pageSize) {
        return new StatusMessageDTO(adminService.getDeviceMasterPage(currentPage,pageSize));
    }

    @GetMapping("/getOrderMaster")
    public StatusMessageDTO getOrderMaster(int currentPage, int pageSize) {
        return new StatusMessageDTO(adminService.getOrderMaster(currentPage,pageSize));
    }

    @GetMapping("/getOrderProduct")
    public StatusMessageDTO getOrderProduct(int orderId) {
        return new StatusMessageDTO(adminService.getOrderProduct(orderId));
    }

    @GetMapping("/getBookInfoFromISBN")
    public StatusMessageDTO getBookInfoFromISBN(String isbn) {
        StatusMessageDTO statusMessageDTO =  new StatusMessageDTO(adminService.getBookInfoFromISBN(isbn));
        System.out.print(statusMessageDTO);
        return statusMessageDTO;
    }

    @PostMapping("/addBookWithBookInfo")
    public StatusMessagePojo addBookWithBookInfo(BookInfo bookInfo) {
        return adminService.addBookWithBookInfo(bookInfo);
    }

    @GetMapping("/addBookTag")
    public StatusMessagePojo addBookTag(int bookInfoId, String tag) {
        return adminService.addBookTag(bookInfoId,tag);
    }

    @GetMapping("/getSaleTotalWithDate")
    public double getSaleTotalWithDate(String beginDate, String endDate) {
        return adminService.getSaleTotalWithDate(TimeUtil.strToDate(beginDate),TimeUtil.strToDate(endDate));
    }

    @GetMapping("/getSalesWithDate")
    public StatusMessageDTO getSalesWithDate(String beginDate, String endDate) {
        return new StatusMessageDTO(adminService.getSalesWithDate(TimeUtil.strToDate(beginDate),TimeUtil.strToDate(endDate)));
    }

    @GetMapping("/getSaleToday")
    public double getSaleToday() {
        return adminService.getSaleToday();
    }

    @GetMapping("/getVisterTotalWithDate")
    public int getVisterTotalWithDate(String beginDate, String endDate) {
        return adminService.getVisterTotalWithDate(TimeUtil.strToDate(beginDate),TimeUtil.strToDate(endDate));
    }

    @GetMapping("/getVistersWithDate")
    public StatusMessageDTO getVistersWithDate(String beginDate, String endDate) {
        return new StatusMessageDTO(adminService.getVistersWithDate(TimeUtil.strToDate(beginDate),TimeUtil.strToDate(endDate)));
    }

    @GetMapping("/getVisterToday")
    public int getVisterToday() {
        return adminService.getVisterToday();
    }
}
