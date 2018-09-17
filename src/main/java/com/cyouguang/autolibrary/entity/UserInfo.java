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
 * 用户信息表
 *
 * @author CyouGuang
 */
@Table(name="`user_info`")
public class UserInfo implements Serializable {
    /**
     *   用户信息表自增主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Integer user_info_id;

    /**
     *   用户账号表主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Integer user_id;

    /**
     *   用户真实姓名
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private String name;

    /**
     *   性别
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private String gender;

    /**
     *   电子邮箱
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private String email;

    /**
     *   用户头像
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private String avatar;

    /**
     *   积分
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Long integral;

    /**
     *   注册时间
     *
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    private Date register_time;

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
     * This method returns the value of the database column user_info.user_info_id
     *
     * @return the value of user_info.user_info_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Integer getUser_info_id() {
        return user_info_id;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserInfo withUser_info_id(Integer user_info_id) {
        this.setUser_info_id(user_info_id);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.user_info_id
     *
     * @param user_info_id the value for user_info.user_info_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setUser_info_id(Integer user_info_id) {
        this.user_info_id = user_info_id;
    }

    /**
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
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
    public UserInfo withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.user_id
     *
     * @param user_id the value for user_info.user_id
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column user_info.name
     *
     * @return the value of user_info.name
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserInfo withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.name
     *
     * @param name the value for user_info.name
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column user_info.gender
     *
     * @return the value of user_info.gender
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserInfo withGender(String gender) {
        this.setGender(gender);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.gender
     *
     * @param gender the value for user_info.gender
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method returns the value of the database column user_info.email
     *
     * @return the value of user_info.email
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserInfo withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.email
     *
     * @param email the value for user_info.email
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method returns the value of the database column user_info.avatar
     *
     * @return the value of user_info.avatar
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserInfo withAvatar(String avatar) {
        this.setAvatar(avatar);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.avatar
     *
     * @param avatar the value for user_info.avatar
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method returns the value of the database column user_info.integral
     *
     * @return the value of user_info.integral
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Long getIntegral() {
        return integral;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserInfo withIntegral(Long integral) {
        this.setIntegral(integral);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.integral
     *
     * @param integral the value for user_info.integral
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    /**
     * This method returns the value of the database column user_info.register_time
     *
     * @return the value of user_info.register_time
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public Date getRegister_time() {
        return register_time;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public UserInfo withRegister_time(Date register_time) {
        this.setRegister_time(register_time);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.register_time
     *
     * @param register_time the value for user_info.register_time
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }

    /**
     * This method returns the value of the database column user_info.modified_time
     *
     * @return the value of user_info.modified_time
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
    public UserInfo withModified_time(Date modified_time) {
        this.setModified_time(modified_time);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.modified_time
     *
     * @param modified_time the value for user_info.modified_time
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
        sb.append(", user_info_id=").append(user_info_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", email=").append(email);
        sb.append(", avatar=").append(avatar);
        sb.append(", integral=").append(integral);
        sb.append(", register_time=").append(register_time);
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
        UserInfo other = (UserInfo) that;
        return (this.getUser_info_id() == null ? other.getUser_info_id() == null : this.getUser_info_id().equals(other.getUser_info_id()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getIntegral() == null ? other.getIntegral() == null : this.getIntegral().equals(other.getIntegral()))
            && (this.getRegister_time() == null ? other.getRegister_time() == null : this.getRegister_time().equals(other.getRegister_time()))
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
        result = prime * result + ((getUser_info_id() == null) ? 0 : getUser_info_id().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getRegister_time() == null) ? 0 : getRegister_time().hashCode());
        result = prime * result + ((getModified_time() == null) ? 0 : getModified_time().hashCode());
        return result;
    }
}