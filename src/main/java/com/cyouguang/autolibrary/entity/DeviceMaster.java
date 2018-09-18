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
 * 设备主表
 *
 * @author CyouGuang
 */
@Table(name="`device_master`")
public class DeviceMaster implements Serializable {
    /**
     *   设备主表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer device_id;

    /**
     *   设备地址
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String place;

    /**
     *   状态码
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Byte status;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column device_master.device_id
     *
     * @return the value of device_master.device_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getDevice_id() {
        return device_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public DeviceMaster withDevice_id(Integer device_id) {
        this.setDevice_id(device_id);
        return this;
    }

    /**
     * This method sets the value of the database column device_master.device_id
     *
     * @param device_id the value for device_master.device_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    /**
     * This method returns the value of the database column device_master.place
     *
     * @return the value of device_master.place
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getPlace() {
        return place;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public DeviceMaster withPlace(String place) {
        this.setPlace(place);
        return this;
    }

    /**
     * This method sets the value of the database column device_master.place
     *
     * @param place the value for device_master.place
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * This method returns the value of the database column device_master.status
     *
     * @return the value of device_master.status
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
    public DeviceMaster withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column device_master.status
     *
     * @param status the value for device_master.status
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
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
        sb.append(", device_id=").append(device_id);
        sb.append(", place=").append(place);
        sb.append(", status=").append(status);
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
        DeviceMaster other = (DeviceMaster) that;
        return (this.getDevice_id() == null ? other.getDevice_id() == null : this.getDevice_id().equals(other.getDevice_id()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDevice_id() == null) ? 0 : getDevice_id().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}