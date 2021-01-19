package com.luoys.upgrade.flagweb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class PointLogVO {

    private String pointId;

    private String taskDailyId;

    private Integer point;

    private String description;

    private String comment;

    /**
     * 1-增加；2-减少
     */
    private Integer type;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date recordTime;

}
