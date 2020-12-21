package com.luoys.upgrade.flagweb.vo;

import lombok.Data;

@Data
public class TaskDailyDetailVO extends TaskDailyVO {

    // 每日任务 关联的账户信息
    private String ownerId;
    private String ownerName;
    private String witnessId;
    private String witnessName;

}
