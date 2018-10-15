package com.cyouguang.autolibrary.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author CyouGuang
 * @date 2018/9/18
 */
@Getter
@Setter
public class XYPojo {
    private String x;
    private String y;

    public XYPojo() {
    }

    public XYPojo(String x, String y) {
        this.x = x;
        this.y = y;
    }
}
