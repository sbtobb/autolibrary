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
 * 订单商品表
 *
 * @author CyouGuang
 */
@Table(name="`order_product`")
public class OrderProduct implements Serializable {
    /**
     *   订单商品表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer product_id;

    /**
     *   书籍信息表自增主键id
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Integer order_id;

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
     *   价格
     *
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private Long price;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column order_product.product_id
     *
     * @return the value of order_product.product_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getProduct_id() {
        return product_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public OrderProduct withProduct_id(Integer product_id) {
        this.setProduct_id(product_id);
        return this;
    }

    /**
     * This method sets the value of the database column order_product.product_id
     *
     * @param product_id the value for order_product.product_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    /**
     * This method returns the value of the database column order_product.order_id
     *
     * @return the value of order_product.order_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public OrderProduct withOrder_id(Integer order_id) {
        this.setOrder_id(order_id);
        return this;
    }

    /**
     * This method sets the value of the database column order_product.order_id
     *
     * @param order_id the value for order_product.order_id
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * This method returns the value of the database column order_product.tag
     *
     * @return the value of order_product.tag
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
    public OrderProduct withTag(String tag) {
        this.setTag(tag);
        return this;
    }

    /**
     * This method sets the value of the database column order_product.tag
     *
     * @param tag the value for order_product.tag
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * This method returns the value of the database column order_product.title
     *
     * @return the value of order_product.title
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
    public OrderProduct withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column order_product.title
     *
     * @param title the value for order_product.title
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column order_product.price
     *
     * @return the value of order_product.price
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
    public OrderProduct withPrice(Long price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column order_product.price
     *
     * @param price the value for order_product.price
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setPrice(Long price) {
        this.price = price;
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
        sb.append(", product_id=").append(product_id);
        sb.append(", order_id=").append(order_id);
        sb.append(", tag=").append(tag);
        sb.append(", title=").append(title);
        sb.append(", price=").append(price);
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
        OrderProduct other = (OrderProduct) that;
        return (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }
}