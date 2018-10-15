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
public class ResultPojo {
    private String reason;
    private BookIsbnPojo result = new BookIsbnPojo();
    private int error_code;
}
