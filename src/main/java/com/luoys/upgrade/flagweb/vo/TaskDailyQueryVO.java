package com.luoys.upgrade.flagweb.vo;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDailyQueryVO {

    String ownerId;

    String witnessId;

    Date startTime;

    Date endTime;
}
