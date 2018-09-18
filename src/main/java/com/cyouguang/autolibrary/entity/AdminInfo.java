package com.cyouguang.autolibrary.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 管理员信息表
 *
 * @author CyouGuang
 */
@Table(name="`admin_info`")
public class AdminInfo implements Serializable {
    /**
     *   管理员信息表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer admin_info_id;

    /**
     *   管理员账号表主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer admin_id;

    /**
     *   用户真实姓名
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String name;

    /**
     *   用户头像
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String avatar;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column admin_info.admin_info_id
     *
     * @return the value of admin_info.admin_info_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getAdmin_info_id() {
        return admin_info_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public AdminInfo withAdmin_info_id(Integer admin_info_id) {
        this.setAdmin_info_id(admin_info_id);
        return this;
    }

    /**
     * This method sets the value of the database column admin_info.admin_info_id
     *
     * @param admin_info_id the value for admin_info.admin_info_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setAdmin_info_id(Integer admin_info_id) {
        this.admin_info_id = admin_info_id;
    }

    /**
     * This method returns the value of the database column admin_info.admin_id
     *
     * @return the value of admin_info.admin_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getAdmin_id() {
        return admin_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public AdminInfo withAdmin_id(Integer admin_id) {
        this.setAdmin_id(admin_id);
        return this;
    }

    /**
     * This method sets the value of the database column admin_info.admin_id
     *
     * @param admin_id the value for admin_info.admin_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    /**
     * This method returns the value of the database column admin_info.name
     *
     * @return the value of admin_info.name
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public AdminInfo withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column admin_info.name
     *
     * @param name the value for admin_info.name
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column admin_info.avatar
     *
     * @return the value of admin_info.avatar
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public AdminInfo withAvatar(String avatar) {
        this.setAvatar(avatar);
        return this;
    }

    /**
     * This method sets the value of the database column admin_info.avatar
     *
     * @param avatar the value for admin_info.avatar
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
        sb.append(", admin_info_id=").append(admin_info_id);
        sb.append(", admin_id=").append(admin_id);
        sb.append(", name=").append(name);
        sb.append(", avatar=").append(avatar);
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
        AdminInfo other = (AdminInfo) that;
        return (this.getAdmin_info_id() == null ? other.getAdmin_info_id() == null : this.getAdmin_info_id().equals(other.getAdmin_info_id()))
            && (this.getAdmin_id() == null ? other.getAdmin_id() == null : this.getAdmin_id().equals(other.getAdmin_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()));
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdmin_info_id() == null) ? 0 : getAdmin_info_id().hashCode());
        result = prime * result + ((getAdmin_id() == null) ? 0 : getAdmin_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        return result;
    }
}