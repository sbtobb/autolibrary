package com.cyouguang.autolibrary.dao;

import com.cyouguang.autolibrary.entity.UserAccount;
import com.cyouguang.autolibrary.entity.UserAccountExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

@Mapper
public interface UserAccountMapper {
    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    long countByExample(UserAccountExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int deleteByExample(UserAccountExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int deleteByPrimaryKey(Integer user_id);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int insert(UserAccount record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int insertSelective(UserAccount record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    List<UserAccount> selectByExample(UserAccountExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    UserAccount selectByPrimaryKey(Integer user_id);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserAccount record, @Param("example") UserAccountExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByExample(@Param("record") UserAccount record, @Param("example") UserAccountExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByPrimaryKeySelective(UserAccount record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByPrimaryKey(UserAccount record);
}