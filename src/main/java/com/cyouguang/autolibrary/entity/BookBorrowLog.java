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
 * 书籍借还表
 *
 * @author CyouGuang
 */
@Table(name="`book_borrow_log`")
public class BookBorrowLog implements Serializable {
    /**
     *   书籍借还表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer borrow_id;

    /**
     *   书籍信息主键id
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
     *   书籍标题
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String title;

    /**
     *   用户账号表主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer user_id;

    /**
     *   0 借书 1 还书
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
     * This method returns the value of the database column book_borrow_log.borrow_id
     *
     * @return the value of book_borrow_log.borrow_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getBorrow_id() {
        return borrow_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookBorrowLog withBorrow_id(Integer borrow_id) {
        this.setBorrow_id(borrow_id);
        return this;
    }

    /**
     * This method sets the value of the database column book_borrow_log.borrow_id
     *
     * @param borrow_id the value for book_borrow_log.borrow_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setBorrow_id(Integer borrow_id) {
        this.borrow_id = borrow_id;
    }

    /**
     * This method returns the value of the database column book_borrow_log.book_info_id
     *
     * @return the value of book_borrow_log.book_info_id
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
    public BookBorrowLog withBook_info_id(Integer book_info_id) {
        this.setBook_info_id(book_info_id);
        return this;
    }

    /**
     * This method sets the value of the database column book_borrow_log.book_info_id
     *
     * @param book_info_id the value for book_borrow_log.book_info_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setBook_info_id(Integer book_info_id) {
        this.book_info_id = book_info_id;
    }

    /**
     * This method returns the value of the database column book_borrow_log.tag
     *
     * @return the value of book_borrow_log.tag
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
    public BookBorrowLog withTag(String tag) {
        this.setTag(tag);
        return this;
    }

    /**
     * This method sets the value of the database column book_borrow_log.tag
     *
     * @param tag the value for book_borrow_log.tag
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * This method returns the value of the database column book_borrow_log.title
     *
     * @return the value of book_borrow_log.title
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookBorrowLog withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column book_borrow_log.title
     *
     * @param title the value for book_borrow_log.title
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column book_borrow_log.user_id
     *
     * @return the value of book_borrow_log.user_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookBorrowLog withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column book_borrow_log.user_id
     *
     * @param user_id the value for book_borrow_log.user_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column book_borrow_log.status
     *
     * @return the value of book_borrow_log.status
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
    public BookBorrowLog withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column book_borrow_log.status
     *
     * @param status the value for book_borrow_log.status
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
        sb.append(", borrow_id=").append(borrow_id);
        sb.append(", book_info_id=").append(book_info_id);
        sb.append(", tag=").append(tag);
        sb.append(", title=").append(title);
        sb.append(", user_id=").append(user_id);
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
        BookBorrowLog other = (BookBorrowLog) that;
        return (this.getBorrow_id() == null ? other.getBorrow_id() == null : this.getBorrow_id().equals(other.getBorrow_id()))
            && (this.getBook_info_id() == null ? other.getBook_info_id() == null : this.getBook_info_id().equals(other.getBook_info_id()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
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
        result = prime * result + ((getBorrow_id() == null) ? 0 : getBorrow_id().hashCode());
        result = prime * result + ((getBook_info_id() == null) ? 0 : getBook_info_id().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}