package com.luoys.upgrade.flagweb.vo;

import lombok.Data;

@Data
public class FlagBindVO {

    private String flagId;

    private String ownerId;

    private String ownerName;

    private String witnessId;

    private String witnessName;

    /**
     * 1-所有者；2-见证人 (暂时不用)
     */
    private Integer type;

    /**
     * 1-未开始; 2-进行中; 3-暂停; 4-已结束; 5-已达成
     */
    private Integer status;

}
