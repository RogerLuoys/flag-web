package com.luoys.upgrade.flagweb.vo;

import lombok.Data;


@Data
public class FlagQueryVO {
    private String flagName;
    private String ownerId;
    private String witnessId;
    private Integer type;
    private Integer priority;
    private Integer status;
    private Integer pageIndex;
}
