package com.luoys.upgrade.flagweb.vo;

import lombok.Data;


@Data
public class FlagQueryVO {
    private String flagName;
    private String ownerId;
    private String witnessId;
    private String type;
    private String priority;
    private String status;
}
