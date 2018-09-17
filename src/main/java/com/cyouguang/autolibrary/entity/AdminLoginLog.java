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
 * 用户登录日志表
 *
 * @author CyouGuang
 */
@Table(name="`admin_login_log`")
public class AdminLoginLog implements Serializable {
    /**
     *   用户登录日志表自增主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Integer log_id;

    /**
     *   管理员表主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Integer admin_id;

    /**
     *   0 未成功 1 成功
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Byte status;

    /**
     *   log记录时间
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Date log_time;

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column admin_login_log.log_id
     *
     * @return the value of admin_login_log.log_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Integer getLog_id() {
        return log_id;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public AdminLoginLog withLog_id(Integer log_id) {
        this.setLog_id(log_id);
        return this;
    }

    /**
     * This method sets the value of the database column admin_login_log.log_id
     *
     * @param log_id the value for admin_login_log.log_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    /**
     * This method returns the value of the database column admin_login_log.admin_id
     *
     * @return the value of admin_login_log.admin_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Integer getAdmin_id() {
        return admin_id;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public AdminLoginLog withAdmin_id(Integer admin_id) {
        this.setAdmin_id(admin_id);
        return this;
    }

    /**
     * This method sets the value of the database column admin_login_log.admin_id
     *
     * @param admin_id the value for admin_login_log.admin_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    /**
     * This method returns the value of the database column admin_login_log.status
     *
     * @return the value of admin_login_log.status
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
    public AdminLoginLog withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column admin_login_log.status
     *
     * @param status the value for admin_login_log.status
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column admin_login_log.log_time
     *
     * @return the value of admin_login_log.log_time
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Date getLog_time() {
        return log_time;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public AdminLoginLog withLog_time(Date log_time) {
        this.setLog_time(log_time);
        return this;
    }

    /**
     * This method sets the value of the database column admin_login_log.log_time
     *
     * @param log_time the value for admin_login_log.log_time
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setLog_time(Date log_time) {
        this.log_time = log_time;
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
        sb.append(", log_id=").append(log_id);
        sb.append(", admin_id=").append(admin_id);
        sb.append(", status=").append(status);
        sb.append(", log_time=").append(log_time);
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
        AdminLoginLog other = (AdminLoginLog) that;
        return (this.getLog_id() == null ? other.getLog_id() == null : this.getLog_id().equals(other.getLog_id()))
            && (this.getAdmin_id() == null ? other.getAdmin_id() == null : this.getAdmin_id().equals(other.getAdmin_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLog_time() == null ? other.getLog_time() == null : this.getLog_time().equals(other.getLog_time()));
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLog_id() == null) ? 0 : getLog_id().hashCode());
        result = prime * result + ((getAdmin_id() == null) ? 0 : getAdmin_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLog_time() == null) ? 0 : getLog_time().hashCode());
        return result;
    }
}