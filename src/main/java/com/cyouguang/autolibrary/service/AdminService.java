package com.cyouguang.autolibrary.service;

import com.cyouguang.autolibrary.entity.*;
import com.cyouguang.autolibrary.pojo.BookIsbnPojo;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.pojo.XYPojo;

import java.util.Date;
import java.util.List;

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

    /**
     * 取到分页用户信息表
     * @param currentPage 页数
     * @param pageSize 页大小
     * @return 用户信息 list
     */
    List<UserInfo> getUserInfoPage(int currentPage,int pageSize);

    /**
     * 修改用户积分
     * @param userInfoId 用户id
     * @param integral 积分
     * @return 状态信息码
     */
    StatusMessagePojo changeIntegral(int userInfoId,double integral);

    /**
     * 分页取出图书信息
     * @param currentPage 页数
     * @param pageSize 页大小
     * @return BookInfo List
     */
    List<BookInfo> getBookInfoPage(int currentPage,int pageSize);

    /**
     * 取出图书id下所有标签
     * @param bookInfoId 书籍信息id
     * @return BookTag list
     */
    List<BookTag> getBookTagList(int bookInfoId);

    /**
     * 返回书籍借还书列表
     * @param currentPage 页数
     * @param pageSize 页大小
     * @return BookBorrowLog list
     */
    List<BookBorrowLog> getBookBorrowLogPage(int currentPage,int pageSize);

    /**
     * 取设备信息
     * @param currentPage 页数
     * @param pageSize 页大小
     * @return DeviceMaster list
     */
    List<DeviceMaster> getDeviceMasterPage(int currentPage,int pageSize);

    /**
     * 取得订单信息
     * @param currentPage 页数
     * @param pageSize 页大小
     * @return OrderMaster list
     */
    List<OrderMaster> getOrderMaster(int currentPage,int pageSize);

    /**
     * 取得订单详情列表
     * @param orderId 订单id
     * @return OrderProduct list
     */
    List<OrderProduct> getOrderProduct(int orderId);

    /**
     * 从isbn号码取到图书信息
     * @param isbn isbn号码
     * @return bookinfo
     */
    BookIsbnPojo getBookInfoFromISBN(String isbn);

    /**
     * 添加图书
     * @param bookInfo 图书信息
     * @return 状态信息码
     */
    StatusMessagePojo addBookWithBookInfo(BookInfo bookInfo);

    /**
     * 添加电子标签
     * @param bookInfoId 图书id
     * @param tag 电子标签
     * @return 状态信息码
     */
    StatusMessagePojo addBookTag(int bookInfoId,String tag);

    /**
     * 取出销售总额
     * @param beginDate 开始时间
     * @param endDate 结束时间
     * @return 总额
     */
    double getSaleTotalWithDate(Date beginDate,Date endDate);

    /**
     * 取出单日销售信息
     * @param beginDate 开始时间
     * @param endDate 结束时间
     * @return x 日期 y 销售额
     */
    List<XYPojo> getSalesWithDate(Date beginDate, Date endDate);

    /**
     * 取出今日销售额
     * @return 销售额
     */
    double getSaleToday();

    /**
     * 取出访问人数
     * @param beginDate 开始时间
     * @param endDate 结束时间
     * @return 总访问人数
     */
    int getVisterTotalWithDate(Date beginDate,Date endDate);

    /**
     * 取出单日访问人数
     * @param beginDate 开始时间
     * @param endDate 结束时间
     * @return x 日期 y 访问人数
     */

    List<XYPojo> getVistersWithDate(Date beginDate, Date endDate);

    /**
     * 取出今日访问人数
     * @return 访问人数
     */
    int getVisterToday();


}
