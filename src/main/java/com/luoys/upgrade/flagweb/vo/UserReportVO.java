package com.luoys.upgrade.flagweb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;


@Data
public class UserReportVO {

    private String flagId;

    private String flagName;

    private Integer totalPoint;

    private Integer totalTaskDaily;

//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private Date startTime;
//
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private Date endTime;
}
