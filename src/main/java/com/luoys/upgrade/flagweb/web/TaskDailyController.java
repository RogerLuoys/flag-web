package com.luoys.upgrade.flagweb.web;

import com.luoys.upgrade.flagweb.client.TaskDailyClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.TaskDailyVO;
import com.luoys.upgrade.flagweb.vo.TaskVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/taskDaily")
@Slf4j
@CrossOrigin
public class TaskDailyController {

    @Autowired
    private TaskDailyClient taskDailyClient;

    @RequestMapping(value = "/newTaskDaily", method = RequestMethod.POST)
    public Result<String> newTask(@RequestBody TaskDailyVO taskDailyVO) {
        return taskDailyClient.newTaskDaily(taskDailyVO);
    }

}
