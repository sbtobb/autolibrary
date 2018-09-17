package com.cyouguang.autolibrary.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 订单主表
 *
 * @author CyouGuang
 */
@Table(name="`order_master`")
public class OrderMaster implements Serializable {
    /**
     *   书籍信息表自增主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Integer order_id;

    /**
     *   设备主表自增主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Integer device_id;

    /**
     *   用户账号表主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Integer user_id;

    /**
     *   总价
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Long total_price;

    /**
     *   -1 取消支付 0 未支付 1 已支付
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Byte status;

    /**
     *   创建时间
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Date create_time;

    /**
     *   最后修改时间
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Date modified_time;

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column order_master.order_id
     *
     * @return the value of order_master.order_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public OrderMaster withOrder_id(Integer order_id) {
        this.setOrder_id(order_id);
        return this;
    }

    /**
     * This method sets the value of the database column order_master.order_id
     *
     * @param order_id the value for order_master.order_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * This method returns the value of the database column order_master.device_id
     *
     * @return the value of order_master.device_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Integer getDevice_id() {
        return device_id;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public OrderMaster withDevice_id(Integer device_id) {
        this.setDevice_id(device_id);
        return this;
    }

    /**
     * This method sets the value of the database column order_master.device_id
     *
     * @param device_id the value for order_master.device_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    /**
     * This method returns the value of the database column order_master.user_id
     *
     * @return the value of order_master.user_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public OrderMaster withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column order_master.user_id
     *
     * @param user_id the value for order_master.user_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column order_master.total_price
     *
     * @return the value of order_master.total_price
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Long getTotal_price() {
        return total_price;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public OrderMaster withTotal_price(Long total_price) {
        this.setTotal_price(total_price);
        return this;
    }

    /**
     * This method sets the value of the database column order_master.total_price
     *
     * @param total_price the value for order_master.total_price
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setTotal_price(Long total_price) {
        this.total_price = total_price;
    }

    /**
     * This method returns the value of the database column order_master.status
     *
     * @return the value of order_master.status
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public OrderMaster withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column order_master.status
     *
     * @param status the value for order_master.status
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column order_master.create_time
     *
     * @return the value of order_master.create_time
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public OrderMaster withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column order_master.create_time
     *
     * @param create_time the value for order_master.create_time
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column order_master.modified_time
     *
     * @return the value of order_master.modified_time
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Date getModified_time() {
        return modified_time;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public OrderMaster withModified_time(Date modified_time) {
        this.setModified_time(modified_time);
        return this;
    }

    /**
     * This method sets the value of the database column order_master.modified_time
     *
     * @param modified_time the value for order_master.modified_time
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", order_id=").append(order_id);
        sb.append(", device_id=").append(device_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", total_price=").append(total_price);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", modified_time=").append(modified_time);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderMaster other = (OrderMaster) that;
        return (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getDevice_id() == null ? other.getDevice_id() == null : this.getDevice_id().equals(other.getDevice_id()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getTotal_price() == null ? other.getTotal_price() == null : this.getTotal_price().equals(other.getTotal_price()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getModified_time() == null ? other.getModified_time() == null : this.getModified_time().equals(other.getModified_time()));
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getDevice_id() == null) ? 0 : getDevice_id().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getTotal_price() == null) ? 0 : getTotal_price().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getModified_time() == null) ? 0 : getModified_time().hashCode());
        return result;
    }
}