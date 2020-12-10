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

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface TaskClient {

    @RequestMapping(value = "/task/modifyTask", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<TaskVO> modifyTask(@RequestBody TaskVO taskVO);

    @RequestMapping(value = "/task/newTask", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<TaskVO> newTask(@RequestBody TaskVO taskVO);

}
