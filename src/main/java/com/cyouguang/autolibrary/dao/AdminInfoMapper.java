package com.cyouguang.autolibrary.dao;

import com.cyouguang.autolibrary.entity.AdminInfo;
import com.cyouguang.autolibrary.entity.AdminInfoExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

@Mapper
public interface AdminInfoMapper {
    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    long countByExample(AdminInfoExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int deleteByExample(AdminInfoExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int deleteByPrimaryKey(Integer admin_info_id);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int insert(AdminInfo record);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int insertSelective(AdminInfo record);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    List<AdminInfo> selectByExample(AdminInfoExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    AdminInfo selectByPrimaryKey(Integer admin_info_id);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int updateByExample(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int updateByPrimaryKeySelective(AdminInfo record);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int updateByPrimaryKey(AdminInfo record);
}