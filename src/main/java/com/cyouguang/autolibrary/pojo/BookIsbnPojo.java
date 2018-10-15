package com.cyouguang.autolibrary.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author CyouGuang
 * @date 2018/9/21
 */
@Getter
@Setter
@ToString
public class BookIsbnPojo {

    private int levelNum;
    private String subtitle;
    private String author;
    private String pubdate;
    private String origin_title;
    private String binding;
    private int pages;
    private String images_medium;
    private String images_large;
    private String publisher;
    private String isbn10;
    private String isbn13;
    private String title;
    private String summary;
    private double price;
}
