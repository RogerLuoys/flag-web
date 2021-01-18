package com.luoys.upgrade.flagweb.client;

import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.PointSummaryVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002", path = "/point")
public interface PointClient {

    @RequestMapping(value = "/queryPointSummary", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<PointSummaryVO> queryPointSummary(@RequestParam("ownerId") String ownerId);

}
