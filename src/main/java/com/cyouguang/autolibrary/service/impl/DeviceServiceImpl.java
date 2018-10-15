package com.cyouguang.autolibrary.service.impl;

import com.cyouguang.autolibrary.dao.*;
import com.cyouguang.autolibrary.entity.*;
import com.cyouguang.autolibrary.pojo.StatusMessagePojo;
import com.cyouguang.autolibrary.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CyouGuang
 * @date 2018/9/18
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    private final OrderMasterMapper orderMasterMapper;
    private final OrderProductMapper orderProductMapper;
    private final BookTagMapper bookTagMapper;
    private final BookInfoMapper bookInfoMapper;
    private final BookBorrowLogMapper bookBorrowLogMapper;
    private final DeviceMasterMapper deviceMasterMapper;

    @Autowired
    public DeviceServiceImpl(OrderMasterMapper orderMasterMapper, OrderProductMapper orderProductMapper, BookTagMapper bookTagMapper, BookInfoMapper bookInfoMapper, BookBorrowLogMapper bookBorrowLogMapper, DeviceMasterMapper deviceMasterMapper) {
        this.orderMasterMapper = orderMasterMapper;
        this.orderProductMapper = orderProductMapper;
        this.bookTagMapper = bookTagMapper;
        this.bookInfoMapper = bookInfoMapper;
        this.bookBorrowLogMapper = bookBorrowLogMapper;
        this.deviceMasterMapper = deviceMasterMapper;
    }

    @Override
    public OrderMaster createOrder(int deviceId) {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setDevice_id(deviceId);
        if (orderMasterMapper.insertSelective(orderMaster) == 0){
            return null;
        }
        return orderMaster;
    }
    @Override
    public BookTag getBookTag(String tag){
        //取出 bookTag 表
        BookTagExample bookTagExample = new BookTagExample();
        BookTagExample.Criteria criteria = bookTagExample.createCriteria();
        criteria.andTagEqualTo(tag);
        List<BookTag> bookTagList = bookTagMapper.selectByExample(bookTagExample);
        if (bookTagList.size() <= 0){
            return null;
        }
        return bookTagList.get(0);
    }

    @Override
    public StatusMessagePojo addProduct(int orderId, String tag) {
        //取出 bookTag 表
        BookTag bookTag = getBookTag(tag);
        if (bookTag == null){
            return new StatusMessagePojo(404,"未找到此书籍标签,请联系管理员");
        }
        // 取出 book_info 表
        BookInfo bookInfo = bookInfoMapper.selectByPrimaryKey(bookTag.getBook_info_id());
        // 插入 OrderProduct 记录
        OrderProduct orderProduct = new OrderProduct();
        orderProduct.setOrder_id(orderId);
        orderProduct.setBook_info_id(bookTag.getBook_info_id());
        orderProduct.setTag(tag);
        orderProduct.setTitle(bookInfo.getTitle());
        orderProduct.setPic(bookInfo.getPic());
        orderProduct.setPrice(bookInfo.getPrice());
        if (orderProductMapper.insertSelective(orderProduct) <= 0){
            return new StatusMessagePojo(500,"服务器错误，添加书籍失败");
        }
        OrderMaster orderMaster = orderMasterMapper.selectByPrimaryKey(orderId);
        orderMaster.setTotal_price(orderMaster.getTotal_price()+bookInfo.getPrice());
        orderMasterMapper.updateByPrimaryKeySelective(orderMaster);

        return new StatusMessagePojo(200,"成功");
    }

    @Override
    public OrderMaster getOrderMaster(int orderId) {
        return orderMasterMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public StatusMessagePojo borrowBook(String tag) {
        //取出 bookTag 表
        BookTag bookTag = getBookTag(tag);
        if (bookTag == null){
            return new StatusMessagePojo(404,"未找到此书籍标签,请联系管理员");
        }
        // 取出 book_info 表
        BookInfo bookInfo = bookInfoMapper.selectByPrimaryKey(bookTag.getBook_info_id());

        bookTag.setStatus((byte)0);
        bookTagMapper.updateByPrimaryKeySelective(bookTag);

        BookBorrowLog bookBorrowLog = new BookBorrowLog();
        bookBorrowLog.setBook_info_id(bookTag.getBook_info_id());
        bookBorrowLog.setTag(tag);
        bookBorrowLog.setTitle(bookInfo.getTitle());
        bookBorrowLog.setUser_id(0);
        bookBorrowLog.setStatus((byte)1);
        bookBorrowLogMapper.insertSelective(bookBorrowLog);
        return new StatusMessagePojo(200,"归还成功");
    }

    @Override
    public StatusMessagePojo online(int deviceId) {
        return changeDeviceStatus(deviceId,(byte)1);
    }

    @Override
    public StatusMessagePojo offline(int deviceId) {
        return changeDeviceStatus(deviceId,(byte)0);
    }

    private StatusMessagePojo changeDeviceStatus(int deviceId,byte status){
        DeviceMaster deviceMaster = deviceMasterMapper.selectByPrimaryKey(deviceId);
        deviceMaster.setStatus(status);
        return new StatusMessagePojo(200,"修改成功");
    }
}
