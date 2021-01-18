package com.luoys.upgrade.flagweb.web;

import com.luoys.upgrade.flagweb.client.PointClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.PointSummaryVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/point")
@Slf4j
@CrossOrigin
public class PointController {

    @Autowired
    private PointClient pointClient;

    @RequestMapping(value = "/queryPointSummary", method = RequestMethod.GET)
    Result<PointSummaryVO> queryPointSummary(@RequestHeader("UserId") String userId) {
        if (userId == null) {
            return Result.error("用户ID不能为空");
        }
        return pointClient.queryPointSummary(userId);
    }
}
