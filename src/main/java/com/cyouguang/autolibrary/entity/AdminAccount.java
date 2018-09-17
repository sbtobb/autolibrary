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
 * 管理员账号表
 *
 * @author CyouGuang
 */
@Table(name="`admin_account`")
public class AdminAccount implements Serializable {
    /**
     *   管理员账号表自增主键id
     *
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    private Integer admin_id;

    /**
     *   用户登录名
     *
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    private String login_name;

    /**
     *   md5加密的密码
     *
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    private String password;

    /**
     *   最后修改时间
     *
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    private Date modified_time;

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column admin_account.admin_id
     *
     * @return the value of admin_account.admin_id
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public Integer getAdmin_id() {
        return admin_id;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public AdminAccount withAdmin_id(Integer admin_id) {
        this.setAdmin_id(admin_id);
        return this;
    }

    /**
     * This method sets the value of the database column admin_account.admin_id
     *
     * @param admin_id the value for admin_account.admin_id
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    /**
     * This method returns the value of the database column admin_account.login_name
     *
     * @return the value of admin_account.login_name
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public String getLogin_name() {
        return login_name;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public AdminAccount withLogin_name(String login_name) {
        this.setLogin_name(login_name);
        return this;
    }

    /**
     * This method sets the value of the database column admin_account.login_name
     *
     * @param login_name the value for admin_account.login_name
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    /**
     * This method returns the value of the database column admin_account.password
     *
     * @return the value of admin_account.password
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public AdminAccount withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column admin_account.password
     *
     * @param password the value for admin_account.password
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column admin_account.modified_time
     *
     * @return the value of admin_account.modified_time
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public Date getModified_time() {
        return modified_time;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public AdminAccount withModified_time(Date modified_time) {
        this.setModified_time(modified_time);
        return this;
    }

    /**
     * This method sets the value of the database column admin_account.modified_time
     *
     * @param modified_time the value for admin_account.modified_time
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", admin_id=").append(admin_id);
        sb.append(", login_name=").append(login_name);
        sb.append(", password=").append(password);
        sb.append(", modified_time=").append(modified_time);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
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
        AdminAccount other = (AdminAccount) that;
        return (this.getAdmin_id() == null ? other.getAdmin_id() == null : this.getAdmin_id().equals(other.getAdmin_id()))
            && (this.getLogin_name() == null ? other.getLogin_name() == null : this.getLogin_name().equals(other.getLogin_name()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getModified_time() == null ? other.getModified_time() == null : this.getModified_time().equals(other.getModified_time()));
    }

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:47 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdmin_id() == null) ? 0 : getAdmin_id().hashCode());
        result = prime * result + ((getLogin_name() == null) ? 0 : getLogin_name().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getModified_time() == null) ? 0 : getModified_time().hashCode());
        return result;
    }
}