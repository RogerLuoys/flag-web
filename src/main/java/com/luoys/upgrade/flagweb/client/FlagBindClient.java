package com.luoys.upgrade.flagweb.client;

import com.luoys.upgrade.flagweb.util.PageListJO;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.*;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002", path = "/flagBind")
public interface FlagBindClient {

    @RequestMapping(value = "/queryFlagList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<PageListJO<UserFlagVO>> queryFlagList(@RequestBody FlagQueryVO flagQueryVO);

    @RequestMapping(value = "/queryReportList", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<UserReportVO>> queryReportList(@RequestParam("ownerId") String ownerId);

    @RequestMapping(value = "/queryTaskDailyList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<UserTaskDailyVO>> queryTaskDailyList(@RequestBody TaskDailyQueryVO taskDailyQueryVO);
}
