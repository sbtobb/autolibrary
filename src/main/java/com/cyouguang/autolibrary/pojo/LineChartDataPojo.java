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
public class LineChartDataPojo {
    private int[] saleData;
    private int[] visitorData;

    public LineChartDataPojo() {
    }

    public LineChartDataPojo(int[] saleData, int[] visitorData) {
        this.saleData = saleData;
        this.visitorData = visitorData;
    }
}
