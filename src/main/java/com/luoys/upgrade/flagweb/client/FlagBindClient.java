package com.luoys.upgrade.flagweb.client;

import com.luoys.common.api.PageInfo;
import com.luoys.common.api.PageListJO;
import com.luoys.common.api.Result;
import com.luoys.upgrade.flagweb.vo.*;
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
public interface FlagBindClient {

    @RequestMapping(value = "/flagBind/queryFlagList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<PageInfo<UserFlagVO>> queryFlagList(@RequestBody FlagQueryVO flagQueryVO);

    @RequestMapping(value = "/flagBind/queryReportList", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<UserReportVO>> queryReportList(@RequestParam("ownerId") String ownerId, @RequestParam("status") Integer status);

    @RequestMapping(value = "/flagBind/queryTaskDailyList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<UserTaskDailyVO>> queryTaskDailyList(@RequestBody TaskDailyQueryVO taskDailyQueryVO);

    @RequestMapping(value = "/flagBind/modifyWitness", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> modifyWitness(@RequestBody FlagBindVO flagBindVO);
}
