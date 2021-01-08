package com.luoys.upgrade.flagweb.vo;

import lombok.Data;

import java.util.List;

@Data
public class ReportVO {

    private String flagId;
    private String flagName;
    private String description;
    private String expected;
    private String actual;

    private String witnessId;
    private String witnessName;

    private List<ReportLogVO> reportLogList;

}
