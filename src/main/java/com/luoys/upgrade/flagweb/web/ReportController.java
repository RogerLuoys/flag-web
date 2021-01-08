package com.luoys.upgrade.flagweb.web;


import com.luoys.upgrade.flagweb.client.FlagBindClient;
import com.luoys.upgrade.flagweb.client.ReportClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.ReportVO;
import com.luoys.upgrade.flagweb.vo.UserReportVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/report")
@Slf4j
@CrossOrigin
public class ReportController {
    @Autowired
    private FlagBindClient flagBindClient;

    @Autowired
    private ReportClient reportClient;

    @RequestMapping(value = "/queryReportList", method = RequestMethod.GET)
    public Result<List<UserReportVO>> queryReportList(@RequestHeader("UserId") String userId) {
        return flagBindClient.queryReportList(userId);
    }

    @RequestMapping(value = "/queryReportDetail", method = RequestMethod.GET)
    public Result<ReportVO> queryReportDetail(@RequestParam("flagId") String flagId) {
        return reportClient.queryReportDetail(flagId);
    }


}
