package com.cyouguang.autolibrary.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author CyouGuang
 * @date 2018/10/20
 */
@Getter
@Setter
@ToString
public class PanelGroupDataPojo {
    private int sale;
    private int visitor;
    private int payment;

    public PanelGroupDataPojo() {

    }

    public PanelGroupDataPojo(int sale, int visitor, int payment) {
        this.sale = sale;
        this.visitor = visitor;
        this.payment = payment;
    }
}
