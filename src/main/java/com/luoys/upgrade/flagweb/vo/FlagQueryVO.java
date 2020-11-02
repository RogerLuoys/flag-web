package com.luoys.upgrade.flagweb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class FlagQueryVO {
    private String flagId;
    private String flagName;
    private String description;
    private String witnessID;
    private String witnessName;
    private String type;
    private String priority;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDate;
    private String status;
}
