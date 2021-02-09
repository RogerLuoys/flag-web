package com.luoys.upgrade.flagweb.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class TaskVO {

    private String taskId;

    private String flagId;

    @NotNull(message = "任务名称不能为空")
    private String taskName;

    private String description;

    private Integer point;

    /**
     * 1-临时任务，2-按周循环，3-按月循环，4-按年循环，5-按节假日循环
     */
    private Integer type;

    /**
     * 1 暂停，2 进行中
     */
    private Integer status;

    /**
     * 1-临时任务：20200101；2-按周循环：Mon=周一；3-按月循环：01=每月1号；4-按年循环：0101=每年一月一日；5-NewYear=新年
     */
    private String cycle;
    private List<String> cycleList;

    /**
     * 是否被扫描生成每日任务
     */
    private Integer isScanned;

}
