package com.cyouguang.autolibrary.pojo;

import com.cyouguang.autolibrary.entity.AdminInfo;
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
public class AdminInfoPojo {
    private String avatar;
    private String name;
    private String[] roles;

    public AdminInfoPojo() {
    }
    public AdminInfoPojo(AdminInfo adminInfo){
        this.avatar = adminInfo.getAvatar();
        this.name = adminInfo.getName();
        this.roles = new String[]{"admin"};
    }

    public AdminInfoPojo(String avatar, String name, String[] roles) {
        this.avatar = avatar;
        this.name = name;
        this.roles = roles;
    }
}
