package com.cyouguang.autolibrary.dto;

import com.cyouguang.autolibrary.pojo.LineChartDataPojo;
import com.cyouguang.autolibrary.pojo.PanelGroupDataPojo;
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
public class DashboardDTO {
    private PanelGroupDataPojo panelGroupData;
    private LineChartDataPojo lineChartData;

    public DashboardDTO() {
    }

    public DashboardDTO(PanelGroupDataPojo panelGroupData, LineChartDataPojo lineChartData) {
        this.panelGroupData = panelGroupData;
        this.lineChartData = lineChartData;
    }
}
