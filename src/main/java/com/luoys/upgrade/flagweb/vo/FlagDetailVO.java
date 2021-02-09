package com.luoys.upgrade.flagweb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
public class FlagDetailVO {

    // flag 信息
    private String flagId;
    @NotNull(message = "flag名不能为空")
    private String flagName;
    private String description;
    private String expected;
    private String actual;
    private Integer type;
    private Integer status;
    private Integer priority;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    // flag 关联的任务信息
    private List<TaskVO> taskList;
    private Integer totalTask;

    // flag 关联的账户信息
    private String ownerId;
    private String ownerName;
    private String witnessId;
    private String witnessName;
}
