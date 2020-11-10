package com.luoys.upgrade.flagweb.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class TaskVO {
    private String taskId;
    @NotNull(message = "任务名称不能为空")
    private String taskName;
    private String description;
    private Integer point;
    private Integer type;
    private String cycle;
}
