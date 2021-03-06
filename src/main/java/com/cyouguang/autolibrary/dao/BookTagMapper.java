package com.cyouguang.autolibrary.dao;

import com.cyouguang.autolibrary.entity.BookTag;
import com.cyouguang.autolibrary.entity.BookTagExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Service;

@Mapper
@Service
public interface BookTagMapper {
    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    long countByExample(BookTagExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int deleteByExample(BookTagExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int deleteByPrimaryKey(Integer book_tag_id);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int insert(BookTag record);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int insertSelective(BookTag record);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    List<BookTag> selectByExample(BookTagExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    BookTag selectByPrimaryKey(Integer book_tag_id);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") BookTag record, @Param("example") BookTagExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int updateByExample(@Param("record") BookTag record, @Param("example") BookTagExample example);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int updateByPrimaryKeySelective(BookTag record);

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    int updateByPrimaryKey(BookTag record);
}