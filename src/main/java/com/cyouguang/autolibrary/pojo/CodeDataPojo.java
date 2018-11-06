package com.cyouguang.autolibrary.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author CyouGuang
 * @date 2018/10/16
 */
@Getter
@Setter
@ToString
public class CodeDataPojo {
    private int code;
    private Object data;

    public CodeDataPojo() {
    }

    public CodeDataPojo(int code, Object data) {
        this.code = code;
        this.data = data;
    }
}
