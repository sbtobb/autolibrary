package com.cyouguang.autolibrary.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author CyouGuang
 * @date 2018/9/17
 */
@Getter
@Setter
public class StatusMessagePojo {
    private int status;
    private String message;

    public StatusMessagePojo(int status) {
        this.status = status;
    }

    public StatusMessagePojo(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
