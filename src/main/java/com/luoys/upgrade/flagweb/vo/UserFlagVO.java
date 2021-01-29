package com.luoys.upgrade.flagweb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UserFlagVO {
    private String flagId;
    private String flagName;
    private String description;
    private String witnessID;
    private String witnessName;
    private Integer type;
    private Integer priority;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private String expected;
    private Integer status;
}
