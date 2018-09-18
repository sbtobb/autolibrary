package com.cyouguang.autolibrary.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 书籍信息表
 *
 * @author CyouGuang
 */
@Table(name="`book_info`")
public class BookInfo implements Serializable {
    /**
     *   书籍信息表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer book_info_id;

    /**
     *   书籍标题
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String title;

    /**
     *   副标题
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String subtitle;

    /**
     *   图片地址
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String pic;

    /**
     *   作者名字
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String author;

    /**
     *   简介
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String summary;

    /**
     *   出版社
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String publisher;

    /**
     *   出版地址
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String pubplace;

    /**
     *   出版时间
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Date pubdate;

    /**
     *   页数
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer page;

    /**
     *   价格
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Long price;

    /**
     *   包装格式
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String binding;

    /**
     *   isbn
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String isbn;

    /**
     *   isbn10
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String isbn10;

    /**
     *   关键词
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String keyword;

    /**
     *   版本
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String edition;

    /**
     *   印次
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String impression;

    /**
     *   语言
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String language;

    /**
     *   装订格式
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String format;

    /**
     *   中图法分类
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private String bookclass;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column book_info.book_info_id
     *
     * @return the value of book_info.book_info_id
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
    public BookInfo withBook_info_id(Integer book_info_id) {
        this.setBook_info_id(book_info_id);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.book_info_id
     *
     * @param book_info_id the value for book_info.book_info_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setBook_info_id(Integer book_info_id) {
        this.book_info_id = book_info_id;
    }

    /**
     * This method returns the value of the database column book_info.title
     *
     * @return the value of book_info.title
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
    public BookInfo withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.title
     *
     * @param title the value for book_info.title
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column book_info.subtitle
     *
     * @return the value of book_info.subtitle
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withSubtitle(String subtitle) {
        this.setSubtitle(subtitle);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.subtitle
     *
     * @param subtitle the value for book_info.subtitle
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * This method returns the value of the database column book_info.pic
     *
     * @return the value of book_info.pic
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
    public BookInfo withPic(String pic) {
        this.setPic(pic);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.pic
     *
     * @param pic the value for book_info.pic
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method returns the value of the database column book_info.author
     *
     * @return the value of book_info.author
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withAuthor(String author) {
        this.setAuthor(author);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.author
     *
     * @param author the value for book_info.author
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This method returns the value of the database column book_info.summary
     *
     * @return the value of book_info.summary
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getSummary() {
        return summary;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withSummary(String summary) {
        this.setSummary(summary);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.summary
     *
     * @param summary the value for book_info.summary
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * This method returns the value of the database column book_info.publisher
     *
     * @return the value of book_info.publisher
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withPublisher(String publisher) {
        this.setPublisher(publisher);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.publisher
     *
     * @param publisher the value for book_info.publisher
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * This method returns the value of the database column book_info.pubplace
     *
     * @return the value of book_info.pubplace
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getPubplace() {
        return pubplace;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withPubplace(String pubplace) {
        this.setPubplace(pubplace);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.pubplace
     *
     * @param pubplace the value for book_info.pubplace
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPubplace(String pubplace) {
        this.pubplace = pubplace;
    }

    /**
     * This method returns the value of the database column book_info.pubdate
     *
     * @return the value of book_info.pubdate
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Date getPubdate() {
        return pubdate;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withPubdate(Date pubdate) {
        this.setPubdate(pubdate);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.pubdate
     *
     * @param pubdate the value for book_info.pubdate
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    /**
     * This method returns the value of the database column book_info.page
     *
     * @return the value of book_info.page
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getPage() {
        return page;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withPage(Integer page) {
        this.setPage(page);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.page
     *
     * @param page the value for book_info.page
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * This method returns the value of the database column book_info.price
     *
     * @return the value of book_info.price
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Long getPrice() {
        return price;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withPrice(Long price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.price
     *
     * @param price the value for book_info.price
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column book_info.binding
     *
     * @return the value of book_info.binding
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getBinding() {
        return binding;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withBinding(String binding) {
        this.setBinding(binding);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.binding
     *
     * @param binding the value for book_info.binding
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setBinding(String binding) {
        this.binding = binding;
    }

    /**
     * This method returns the value of the database column book_info.isbn
     *
     * @return the value of book_info.isbn
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withIsbn(String isbn) {
        this.setIsbn(isbn);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.isbn
     *
     * @param isbn the value for book_info.isbn
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * This method returns the value of the database column book_info.isbn10
     *
     * @return the value of book_info.isbn10
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getIsbn10() {
        return isbn10;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withIsbn10(String isbn10) {
        this.setIsbn10(isbn10);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.isbn10
     *
     * @param isbn10 the value for book_info.isbn10
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    /**
     * This method returns the value of the database column book_info.keyword
     *
     * @return the value of book_info.keyword
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withKeyword(String keyword) {
        this.setKeyword(keyword);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.keyword
     *
     * @param keyword the value for book_info.keyword
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * This method returns the value of the database column book_info.edition
     *
     * @return the value of book_info.edition
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getEdition() {
        return edition;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withEdition(String edition) {
        this.setEdition(edition);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.edition
     *
     * @param edition the value for book_info.edition
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * This method returns the value of the database column book_info.impression
     *
     * @return the value of book_info.impression
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getImpression() {
        return impression;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withImpression(String impression) {
        this.setImpression(impression);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.impression
     *
     * @param impression the value for book_info.impression
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setImpression(String impression) {
        this.impression = impression;
    }

    /**
     * This method returns the value of the database column book_info.language
     *
     * @return the value of book_info.language
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withLanguage(String language) {
        this.setLanguage(language);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.language
     *
     * @param language the value for book_info.language
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * This method returns the value of the database column book_info.format
     *
     * @return the value of book_info.format
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getFormat() {
        return format;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withFormat(String format) {
        this.setFormat(format);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.format
     *
     * @param format the value for book_info.format
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * This method returns the value of the database column book_info.bookclass
     *
     * @return the value of book_info.bookclass
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getBookclass() {
        return bookclass;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookInfo withBookclass(String bookclass) {
        this.setBookclass(bookclass);
        return this;
    }

    /**
     * This method sets the value of the database column book_info.bookclass
     *
     * @param bookclass the value for book_info.bookclass
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setBookclass(String bookclass) {
        this.bookclass = bookclass;
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
        sb.append(", book_info_id=").append(book_info_id);
        sb.append(", title=").append(title);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", pic=").append(pic);
        sb.append(", author=").append(author);
        sb.append(", summary=").append(summary);
        sb.append(", publisher=").append(publisher);
        sb.append(", pubplace=").append(pubplace);
        sb.append(", pubdate=").append(pubdate);
        sb.append(", page=").append(page);
        sb.append(", price=").append(price);
        sb.append(", binding=").append(binding);
        sb.append(", isbn=").append(isbn);
        sb.append(", isbn10=").append(isbn10);
        sb.append(", keyword=").append(keyword);
        sb.append(", edition=").append(edition);
        sb.append(", impression=").append(impression);
        sb.append(", language=").append(language);
        sb.append(", format=").append(format);
        sb.append(", bookclass=").append(bookclass);
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
        BookInfo other = (BookInfo) that;
        return (this.getBook_info_id() == null ? other.getBook_info_id() == null : this.getBook_info_id().equals(other.getBook_info_id()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getSummary() == null ? other.getSummary() == null : this.getSummary().equals(other.getSummary()))
            && (this.getPublisher() == null ? other.getPublisher() == null : this.getPublisher().equals(other.getPublisher()))
            && (this.getPubplace() == null ? other.getPubplace() == null : this.getPubplace().equals(other.getPubplace()))
            && (this.getPubdate() == null ? other.getPubdate() == null : this.getPubdate().equals(other.getPubdate()))
            && (this.getPage() == null ? other.getPage() == null : this.getPage().equals(other.getPage()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBinding() == null ? other.getBinding() == null : this.getBinding().equals(other.getBinding()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
            && (this.getIsbn10() == null ? other.getIsbn10() == null : this.getIsbn10().equals(other.getIsbn10()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getEdition() == null ? other.getEdition() == null : this.getEdition().equals(other.getEdition()))
            && (this.getImpression() == null ? other.getImpression() == null : this.getImpression().equals(other.getImpression()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getBookclass() == null ? other.getBookclass() == null : this.getBookclass().equals(other.getBookclass()));
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBook_info_id() == null) ? 0 : getBook_info_id().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
        result = prime * result + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
        result = prime * result + ((getPubplace() == null) ? 0 : getPubplace().hashCode());
        result = prime * result + ((getPubdate() == null) ? 0 : getPubdate().hashCode());
        result = prime * result + ((getPage() == null) ? 0 : getPage().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBinding() == null) ? 0 : getBinding().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getIsbn10() == null) ? 0 : getIsbn10().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getEdition() == null) ? 0 : getEdition().hashCode());
        result = prime * result + ((getImpression() == null) ? 0 : getImpression().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getBookclass() == null) ? 0 : getBookclass().hashCode());
        return result;
    }
}