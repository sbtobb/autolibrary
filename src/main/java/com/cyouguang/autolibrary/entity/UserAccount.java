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
 * 用户账号表
 *
 * @author CyouGuang
 */
@Table(name="`user_account`")
public class UserAccount implements Serializable {
    /**
     *   用户账号表自增主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Integer user_id;

    /**
     *   用户登录名
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private String login_name;

    /**
     *   md5加密的密码
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private String password;

    /**
     *   用户状态
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Byte user_stats;

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
     * This method returns the value of the database column user_account.user_id
     *
     * @return the value of user_account.user_id
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
    public UserAccount withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column user_account.user_id
     *
     * @param user_id the value for user_account.user_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column user_account.login_name
     *
     * @return the value of user_account.login_name
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public String getLogin_name() {
        return login_name;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserAccount withLogin_name(String login_name) {
        this.setLogin_name(login_name);
        return this;
    }

    /**
     * This method sets the value of the database column user_account.login_name
     *
     * @param login_name the value for user_account.login_name
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    /**
     * This method returns the value of the database column user_account.password
     *
     * @return the value of user_account.password
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserAccount withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column user_account.password
     *
     * @param password the value for user_account.password
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column user_account.user_stats
     *
     * @return the value of user_account.user_stats
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Byte getUser_stats() {
        return user_stats;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserAccount withUser_stats(Byte user_stats) {
        this.setUser_stats(user_stats);
        return this;
    }

    /**
     * This method sets the value of the database column user_account.user_stats
     *
     * @param user_stats the value for user_account.user_stats
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setUser_stats(Byte user_stats) {
        this.user_stats = user_stats;
    }

    /**
     * This method returns the value of the database column user_account.modified_time
     *
     * @return the value of user_account.modified_time
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
    public UserAccount withModified_time(Date modified_time) {
        this.setModified_time(modified_time);
        return this;
    }

    /**
     * This method sets the value of the database column user_account.modified_time
     *
     * @param modified_time the value for user_account.modified_time
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
        sb.append(", user_id=").append(user_id);
        sb.append(", login_name=").append(login_name);
        sb.append(", password=").append(password);
        sb.append(", user_stats=").append(user_stats);
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
        UserAccount other = (UserAccount) that;
        return (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getLogin_name() == null ? other.getLogin_name() == null : this.getLogin_name().equals(other.getLogin_name()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUser_stats() == null ? other.getUser_stats() == null : this.getUser_stats().equals(other.getUser_stats()))
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
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getLogin_name() == null) ? 0 : getLogin_name().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUser_stats() == null) ? 0 : getUser_stats().hashCode());
        result = prime * result + ((getModified_time() == null) ? 0 : getModified_time().hashCode());
        return result;
    }
}