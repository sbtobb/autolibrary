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
@Table(name="`user_login_log`")
public class UserLoginLog implements Serializable {
    /**
     *   用户登录日志表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer log_id;

    /**
     *   用户账号表主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer user_id;

    /**
     *   0 未成功 1 成功
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Byte status;

    /**
     *   log记录时间
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Date log_time;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_login_log.log_id
     *
     * @return the value of user_login_log.log_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getLog_id() {
        return log_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public UserLoginLog withLog_id(Integer log_id) {
        this.setLog_id(log_id);
        return this;
    }

    /**
     * This method sets the value of the database column user_login_log.log_id
     *
     * @param log_id the value for user_login_log.log_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    /**
     * This method returns the value of the database column user_login_log.user_id
     *
     * @return the value of user_login_log.user_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public UserLoginLog withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column user_login_log.user_id
     *
     * @param user_id the value for user_login_log.user_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column user_login_log.status
     *
     * @return the value of user_login_log.status
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public UserLoginLog withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column user_login_log.status
     *
     * @param status the value for user_login_log.status
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column user_login_log.log_time
     *
     * @return the value of user_login_log.log_time
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Date getLog_time() {
        return log_time;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public UserLoginLog withLog_time(Date log_time) {
        this.setLog_time(log_time);
        return this;
    }

    /**
     * This method sets the value of the database column user_login_log.log_time
     *
     * @param log_time the value for user_login_log.log_time
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setLog_time(Date log_time) {
        this.log_time = log_time;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", log_id=").append(log_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", status=").append(status);
        sb.append(", log_time=").append(log_time);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
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
        UserLoginLog other = (UserLoginLog) that;
        return (this.getLog_id() == null ? other.getLog_id() == null : this.getLog_id().equals(other.getLog_id()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLog_time() == null ? other.getLog_time() == null : this.getLog_time().equals(other.getLog_time()));
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLog_id() == null) ? 0 : getLog_id().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLog_time() == null) ? 0 : getLog_time().hashCode());
        return result;
    }
}