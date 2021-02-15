package com.luoys.upgrade.flagweb.client;

import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.TaskDailyDetailVO;
import com.luoys.upgrade.flagweb.vo.TaskDailyVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface TaskDailyClient {

    @RequestMapping(value = "/taskDaily/newTaskDaily", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> newTaskDaily(@RequestBody TaskDailyDetailVO taskDailyDetailVO);

    @RequestMapping(value = "/taskDaily/modifyTaskDailyStatus", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> modifyTaskDailyStatus(@RequestParam("taskDailyId") String taskDailyId, @RequestParam("status") Integer status);

    @RequestMapping(value = "/taskDaily/modifyTaskDailyComment", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> modifyTaskDailyComment(@RequestParam("taskDailyId") String taskDailyId, @RequestParam("comment") String comment);

}
