package com.luoys.upgrade.vo;

@ApiModel("工单查询实例")
@Data
public class FlagVO {

    @ApiModelProperty("标准机构ID")
    private String orgStdId;

    @ApiModelProperty("标准医院ID")
    private String hospStdId;

    @ApiModelProperty("执行状态 1-待处理 2-已完成 3-已撤销 4-已执行")
    private Integer taskStatus;

    @ApiModelProperty("任务来源类型")
    private Integer sourceType;

    @ApiModelProperty("uc患者id")
    private Long wedoctorPatientId;

    @ApiModelProperty("服务项code")
    private String subjectCode;

    @ApiModelProperty("紧急程度")
    private Integer urgencyDegree;

    @ApiModelProperty("是否关注")
    private Boolean hasStar;

    @ApiModelProperty("操作人id")
    private Long userOperated;

    @ApiModelProperty("是否展示已撤销的数据")
    private Boolean allStatus;
}
