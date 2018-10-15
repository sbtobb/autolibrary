package com.cyouguang.autolibrary.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author CyouGuang
 * @date 2018/9/20
 */
@Getter
@Setter
@ToString
public class StatusMessageDTO {
    private int status;
    private String message;
    private Object obj;

    public StatusMessageDTO() {
    }
    public StatusMessageDTO(Object obj){
        if (obj == null){
            this.status = 500;
            this.message = "服务器错误，请求失败";
            this.obj = null;
        }else {
            this.status = 200;
            this.message = "请求成功";
            this.obj = obj;
        }
    }

    public StatusMessageDTO(int status, String message, Object obj) {
        this.status = status;
        this.message = message;
        this.obj = obj;
    }
}
