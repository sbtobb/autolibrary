package com.cyouguang.autolibrary.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author CyouGuang
 * @date 2018/9/18
 */
@Getter
@Setter
public class xyPojo {
    private String x;
    private String y;

    public xyPojo() {
    }

    public xyPojo(String x, String y) {
        this.x = x;
        this.y = y;
    }
}
