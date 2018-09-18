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
 * 用户图书表
 *
 * @author CyouGuang
 */
@Table(name="`user_book`")
public class UserBook implements Serializable {
    /**
     *   用户信息表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer user_book_id;

    /**
     *   用户账号表主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer user_id;

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
     *   书籍标题
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String title;

    /**
     *   图片地址
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String pic;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_book.user_book_id
     *
     * @return the value of user_book.user_book_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getUser_book_id() {
        return user_book_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public UserBook withUser_book_id(Integer user_book_id) {
        this.setUser_book_id(user_book_id);
        return this;
    }

    /**
     * This method sets the value of the database column user_book.user_book_id
     *
     * @param user_book_id the value for user_book.user_book_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setUser_book_id(Integer user_book_id) {
        this.user_book_id = user_book_id;
    }

    /**
     * This method returns the value of the database column user_book.user_id
     *
     * @return the value of user_book.user_id
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
    public UserBook withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column user_book.user_id
     *
     * @param user_id the value for user_book.user_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column user_book.book_info_id
     *
     * @return the value of user_book.book_info_id
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
    public UserBook withBook_info_id(Integer book_info_id) {
        this.setBook_info_id(book_info_id);
        return this;
    }

    /**
     * This method sets the value of the database column user_book.book_info_id
     *
     * @param book_info_id the value for user_book.book_info_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setBook_info_id(Integer book_info_id) {
        this.book_info_id = book_info_id;
    }

    /**
     * This method returns the value of the database column user_book.tag
     *
     * @return the value of user_book.tag
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
    public UserBook withTag(String tag) {
        this.setTag(tag);
        return this;
    }

    /**
     * This method sets the value of the database column user_book.tag
     *
     * @param tag the value for user_book.tag
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * This method returns the value of the database column user_book.title
     *
     * @return the value of user_book.title
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
    public UserBook withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column user_book.title
     *
     * @param title the value for user_book.title
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column user_book.pic
     *
     * @return the value of user_book.pic
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getPic() {
        return pic;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public UserBook withPic(String pic) {
        this.setPic(pic);
        return this;
    }

    /**
     * This method sets the value of the database column user_book.pic
     *
     * @param pic the value for user_book.pic
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPic(String pic) {
        this.pic = pic;
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
        sb.append(", user_book_id=").append(user_book_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", book_info_id=").append(book_info_id);
        sb.append(", tag=").append(tag);
        sb.append(", title=").append(title);
        sb.append(", pic=").append(pic);
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
        UserBook other = (UserBook) that;
        return (this.getUser_book_id() == null ? other.getUser_book_id() == null : this.getUser_book_id().equals(other.getUser_book_id()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getBook_info_id() == null ? other.getBook_info_id() == null : this.getBook_info_id().equals(other.getBook_info_id()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()));
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser_book_id() == null) ? 0 : getUser_book_id().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getBook_info_id() == null) ? 0 : getBook_info_id().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        return result;
    }
}