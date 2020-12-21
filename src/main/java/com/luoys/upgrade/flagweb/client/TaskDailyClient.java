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

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface TaskDailyClient {

    @RequestMapping(value = "/taskDaily/newTaskDaily", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> newTaskDaily(@RequestBody TaskDailyDetailVO taskDailyDetailVO);

}
