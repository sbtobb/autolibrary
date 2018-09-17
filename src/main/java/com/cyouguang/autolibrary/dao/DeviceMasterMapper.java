package com.cyouguang.autolibrary.dao;

import com.cyouguang.autolibrary.entity.DeviceMaster;
import com.cyouguang.autolibrary.entity.DeviceMasterExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

@Mapper
public interface DeviceMasterMapper {
    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    long countByExample(DeviceMasterExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int deleteByExample(DeviceMasterExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int deleteByPrimaryKey(Integer device_id);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int insert(DeviceMaster record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int insertSelective(DeviceMaster record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    List<DeviceMaster> selectByExample(DeviceMasterExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    DeviceMaster selectByPrimaryKey(Integer device_id);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByExampleSelective(@Param("record") DeviceMaster record, @Param("example") DeviceMasterExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByExample(@Param("record") DeviceMaster record, @Param("example") DeviceMasterExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByPrimaryKeySelective(DeviceMaster record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByPrimaryKey(DeviceMaster record);
}