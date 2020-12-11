package com.luoys.upgrade.flagweb.client;

import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.FlagDetailVO;
import com.luoys.upgrade.flagweb.vo.TaskVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface TaskClient {

    @RequestMapping(value = "/task/modifyTask", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> modifyTask(@RequestBody TaskVO taskVO);

    @RequestMapping(value = "/task/newTask", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> newTask(@RequestBody TaskVO taskVO);

    @RequestMapping(value = "/task/queryTaskByTaskId", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<TaskVO> queryTaskByTaskId(@RequestParam("taskId") String taskId);

}
