package com.cyouguang.autolibrary.dao;

import com.cyouguang.autolibrary.entity.UserInfo;
import com.cyouguang.autolibrary.entity.UserInfoExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

@Mapper
public interface UserInfoMapper {
    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    long countByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int deleteByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int deleteByPrimaryKey(Integer user_info_id);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int insert(UserInfo record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int insertSelective(UserInfo record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    UserInfo selectByPrimaryKey(Integer user_info_id);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByPrimaryKey(UserInfo record);
}