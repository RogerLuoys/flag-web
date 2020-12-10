package com.luoys.upgrade.flagweb.web;

import com.luoys.upgrade.flagweb.client.FlagClient;
import com.luoys.upgrade.flagweb.client.TaskClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.FlagDetailVO;
import com.luoys.upgrade.flagweb.vo.TaskVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/task")
@Slf4j
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskClient taskClient;

    @RequestMapping(value = "/newTask", method = RequestMethod.POST)
    public Result<TaskVO> newTask(@RequestBody TaskVO taskVO) {
        return taskClient.newTask(taskVO);
    }

    @RequestMapping(value = "/modifyTask", method = RequestMethod.PUT)
    public Result<TaskVO> modifyTask(@RequestBody TaskVO taskVO) {
        return taskClient.modifyTask(taskVO);
    }

}
