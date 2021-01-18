package com.luoys.upgrade.flagweb.vo;

import lombok.Data;

@Data
public class PointSummaryVO {

    private String pointId;

    /**
     * 总积分
     */
    private Integer usablePoint;

    /**
     * 可用积分
     */
    private Integer expendPoint;

    private Integer totalPoint;

    /**
     * 1-正常；2-冻结
     */
    private Integer status;
}
