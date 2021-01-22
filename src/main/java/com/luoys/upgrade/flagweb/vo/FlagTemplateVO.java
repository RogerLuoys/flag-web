package com.luoys.upgrade.flagweb.vo;

import lombok.Data;

@Data
public class FlagTemplateVO {

    private String flagTemplateId;

    private String flagName;

    private String description;

    /**
     * 期望结果
     */
    private String expected;

    /**
     * 1系统模板；2个人模板
     */
    private Integer type;

    /**
     * 1-flag；2-习惯；3临时任务
     */
    private Integer flagType;

    /**
     * 1公开；2私有
     */
    private Integer status;

    private Integer useCount;

    private String ownerId;

}
