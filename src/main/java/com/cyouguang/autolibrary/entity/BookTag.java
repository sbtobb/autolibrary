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
 * 书籍标签表
 *
 * @author CyouGuang
 */
@Table(name="`book_tag`")
public class BookTag implements Serializable {
    /**
     *   书籍标签表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer book_tag_id;

    /**
     *   书籍信息表主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer book_info_id;

    /**
     *   图书电子标签
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String tag;

    /**
     *   0 未借出 1 已经借出
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
     * This method returns the value of the database column book_tag.book_tag_id
     *
     * @return the value of book_tag.book_tag_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getBook_tag_id() {
        return book_tag_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookTag withBook_tag_id(Integer book_tag_id) {
        this.setBook_tag_id(book_tag_id);
        return this;
    }

    /**
     * This method sets the value of the database column book_tag.book_tag_id
     *
     * @param book_tag_id the value for book_tag.book_tag_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setBook_tag_id(Integer book_tag_id) {
        this.book_tag_id = book_tag_id;
    }

    /**
     * This method returns the value of the database column book_tag.book_info_id
     *
     * @return the value of book_tag.book_info_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getBook_info_id() {
        return book_info_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookTag withBook_info_id(Integer book_info_id) {
        this.setBook_info_id(book_info_id);
        return this;
    }

    /**
     * This method sets the value of the database column book_tag.book_info_id
     *
     * @param book_info_id the value for book_tag.book_info_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setBook_info_id(Integer book_info_id) {
        this.book_info_id = book_info_id;
    }

    /**
     * This method returns the value of the database column book_tag.tag
     *
     * @return the value of book_tag.tag
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getTag() {
        return tag;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookTag withTag(String tag) {
        this.setTag(tag);
        return this;
    }

    /**
     * This method sets the value of the database column book_tag.tag
     *
     * @param tag the value for book_tag.tag
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * This method returns the value of the database column book_tag.status
     *
     * @return the value of book_tag.status
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
    public BookTag withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column book_tag.status
     *
     * @param status the value for book_tag.status
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
        sb.append(", book_tag_id=").append(book_tag_id);
        sb.append(", book_info_id=").append(book_info_id);
        sb.append(", tag=").append(tag);
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
        BookTag other = (BookTag) that;
        return (this.getBook_tag_id() == null ? other.getBook_tag_id() == null : this.getBook_tag_id().equals(other.getBook_tag_id()))
            && (this.getBook_info_id() == null ? other.getBook_info_id() == null : this.getBook_info_id().equals(other.getBook_info_id()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
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
        result = prime * result + ((getBook_tag_id() == null) ? 0 : getBook_tag_id().hashCode());
        result = prime * result + ((getBook_info_id() == null) ? 0 : getBook_info_id().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}