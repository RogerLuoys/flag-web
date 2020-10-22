package com.luoys.upgrade.flagweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member/work/order")
@Slf4j
@Api(tags = "工单")
public class FlagController {

    @ApiOperation("查询工单")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Result<PageInfo<WorkOrderVO>> page(WorkOrderQueryVO queryVO) {
        queryVO.setOrgStdId(queryVO.getOrgOrgStdCode());
        queryVO.setHospStdId(queryVO.getHospOrgStdCode());
        queryVO.setUserOperated(queryVO.getUserCenterUserId());
        queryVO.setAllStatus(Boolean.FALSE);
        return workOrderClient.page(queryVO);
    }

}
