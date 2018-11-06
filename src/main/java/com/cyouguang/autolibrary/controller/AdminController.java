package com.cyouguang.autolibrary.controller;

import com.alibaba.fastjson.JSONObject;
import com.cyouguang.autolibrary.dto.DashboardDTO;
import com.cyouguang.autolibrary.dto.StatusMessageDTO;
import com.cyouguang.autolibrary.entity.*;
import com.cyouguang.autolibrary.pojo.*;
import com.cyouguang.autolibrary.service.AdminService;
import com.cyouguang.autolibrary.util.TimeUtil;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.HttpResource;

import javax.servlet.http.HttpSession;
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
    public Object login(@RequestBody LoginPojo loginPojo, HttpSession session) {
        if (loginPojo == null){
            return new StatusMessagePojo(404,"账号或密码不能为空");
        }
        System.out.println(loginPojo);
        StatusMessagePojo statusMessagePojo = adminService.login(loginPojo.getUsername(),loginPojo.getPassword());
        Object adminAccountObj = session.getAttribute("AdminDetail");
        if (adminAccountObj == null) {
            if (statusMessagePojo.getStatus() == 200){
                AdminAccount adminAccount = adminService.getAdminAccount(loginPojo.getUsername());
                if (adminAccount == null){
                    return new StatusMessagePojo(500,"获取管理员信息失败！");
                }
                session.setAttribute("AdminDetail",adminAccount);
            }else {
                return new StatusMessagePojo(401,"账号或密码错误！");
            }
        }else{
            System.out.print("已存在session，"+session.getAttribute("AdminDetail"));
        }
        return new CodeDataPojo(20000,"{\"token\":\""+session.getId()+"\"}");
    }
    @GetMapping("/info")
    public Object getInfo(HttpSession session){
        Object adminAccountObj = session.getAttribute("AdminDetail");
        if (adminAccountObj == null){
            return new StatusMessagePojo(401,"请先登录");
        }
        AdminAccount adminAccount = (AdminAccount)adminAccountObj;
        AdminInfoPojo adminInfoPojo =  new AdminInfoPojo(adminService.getAdminInfo(adminAccount.getAdmin_id()));
        System.out.println(adminInfoPojo);
        return new CodeDataPojo(20000,adminInfoPojo);
    }
    @PostMapping("/logout")
    public CodeDataPojo logout(HttpSession session){
        session.removeAttribute("AdminDetail");
        return new CodeDataPojo(20000,"注销成功");
    }

    @GetMapping("/getUserInfoPage")
    public Object getUserInfoPage(int currentPage, int pageSize) {
        return new CodeDataPojo(20000,adminService.getUserInfoPage(currentPage,pageSize));
    }

    @GetMapping("/getUserLoginLog")
    public Object getUserLoginLog(int currentPage, int pageSize){
        return new CodeDataPojo(20000,adminService.getUserLoginLog(currentPage,pageSize));
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

    @GetMapping("/getVisitorTotalWithDate")
    public int getVisitorTotalWithDate(String beginDate, String endDate) {
        return adminService.getVisitorTotalWithDate(TimeUtil.strToDate(beginDate),TimeUtil.strToDate(endDate));
    }

    @GetMapping("/getVisitorsWithDate")
    public StatusMessageDTO getVisitorsWithDate(String beginDate, String endDate) {
        return new StatusMessageDTO(adminService.getVisitorsWithDate(TimeUtil.strToDate(beginDate),TimeUtil.strToDate(endDate)));
    }

    @GetMapping("/getVisitorToday")
    public int getVisitorToday() {
        return adminService.getVisitorToday();
    }

    @GetMapping("/dashboard")
    public Object dashboard(HttpSession session){
        Object adminAccountObj = session.getAttribute("AdminDetail");
        if (adminAccountObj == null){
            return new StatusMessagePojo(401,"请先登录");
        }
        PanelGroupDataPojo panelGroupDataPojo = new PanelGroupDataPojo();
        panelGroupDataPojo.setSale((int) adminService.getSaleToday());
        panelGroupDataPojo.setVisitor(adminService.getVisitorToday());
        panelGroupDataPojo.setPayment(adminService.getPaymentNumberToday());
        LineChartDataPojo lineChartDataPojo = new LineChartDataPojo(adminService.getSalesArrayWeek(),adminService.getVisitorArrayWeek());
        DashboardDTO dashboardDTO = new DashboardDTO(panelGroupDataPojo,lineChartDataPojo);
        return new CodeDataPojo(20000,dashboardDTO);
    }
}
