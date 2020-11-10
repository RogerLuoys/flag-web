package com.luoys.upgrade.flagweb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
public class FlagDetailVO {

    private String flagId;
    @NotNull(message = "flag名称不能为空")
    private String flagName;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private Integer priority;
    private String expected;
    private String actual;
    private List<TaskVO> tasks;
}
