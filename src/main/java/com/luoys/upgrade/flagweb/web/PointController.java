package com.luoys.upgrade.flagweb.web;

import com.luoys.common.api.Result;
import com.luoys.upgrade.flagweb.client.PointClient;
import com.luoys.upgrade.flagweb.vo.PointLogVO;
import com.luoys.upgrade.flagweb.vo.PointSummaryVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/point")
@Slf4j
@CrossOrigin
public class PointController {

    @Autowired
    private PointClient pointClient;

    @RequestMapping(value = "/queryPointSummary", method = RequestMethod.GET)
    Result<PointSummaryVO> queryPointSummary(@RequestHeader("userId") String userId) {
        if (userId == null) {
            return Result.error("用户ID不能为空");
        }
        return pointClient.queryPointSummary(userId);
    }

    @RequestMapping(value = "/queryPointLogList", method = RequestMethod.GET)
    Result<List<PointLogVO>> queryPointLogList(@RequestParam("pointId") String pointId, @RequestParam("type") Integer type){
        return pointClient.queryPointLogList(pointId, type);
    }


    @RequestMapping(value = "/newPointLog", method = RequestMethod.POST)
    Result<String> newPointLog(@RequestBody PointLogVO pointLogVO) {
        return pointClient.newPointLog(pointLogVO);
    }

}
