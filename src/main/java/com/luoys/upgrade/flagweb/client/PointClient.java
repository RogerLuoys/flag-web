package com.luoys.upgrade.flagweb.client;

import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.PointLogVO;
import com.luoys.upgrade.flagweb.vo.PointSummaryVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface PointClient {

    @RequestMapping(value = "/point/queryPointSummary", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<PointSummaryVO> queryPointSummary(@RequestParam("ownerId") String ownerId);

    @RequestMapping(value = "/point/queryPointLogList", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<PointLogVO>> queryPointLogList(@RequestParam("pointId") String pointId, @RequestParam("type") Integer type);

    @RequestMapping(value = "/point/newPointLog", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> newPointLog(@RequestBody PointLogVO pointLogVO);

}
