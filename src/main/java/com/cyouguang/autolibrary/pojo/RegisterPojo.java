package com.cyouguang.autolibrary.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author CyouGuang
 * @date 2018/9/20
 */
@Getter
@Setter
public class RegisterPojo {
    private String loginName;
    private String password;
    private String name;
    private String gender;
    private String email;
}
