package com.cyouguang.autolibrary.dao;

import com.cyouguang.autolibrary.entity.OrderProduct;
import com.cyouguang.autolibrary.entity.OrderProductExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

@Mapper
public interface OrderProductMapper {
    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    long countByExample(OrderProductExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int deleteByExample(OrderProductExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int deleteByPrimaryKey(Integer product_id);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int insert(OrderProduct record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int insertSelective(OrderProduct record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    List<OrderProduct> selectByExample(OrderProductExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    OrderProduct selectByPrimaryKey(Integer product_id);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByExampleSelective(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByExample(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByPrimaryKeySelective(OrderProduct record);

    /**
     *
     * @mbg.generated Mon Sep 17 17:50:48 CST 2018
     */
    int updateByPrimaryKey(OrderProduct record);
}