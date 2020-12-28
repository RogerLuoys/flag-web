package com.luoys.upgrade.flagweb.web;

import com.luoys.upgrade.flagweb.client.FlagBindClient;
import com.luoys.upgrade.flagweb.client.TaskDailyClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taskDaily")
@Slf4j
@CrossOrigin
public class TaskDailyController {

    @Autowired
    private TaskDailyClient taskDailyClient;

    @Autowired
    private FlagBindClient flagBindClient;

    @RequestMapping(value = "/newTaskDaily", method = RequestMethod.POST)
    public Result<String> newTaskDaily(@RequestHeader("UserId") String userId, @RequestBody TaskDailyDetailVO taskDailyDetailVO) {
        taskDailyDetailVO.setOwnerId(userId);
        return Result.success(taskDailyClient.newTaskDaily(taskDailyDetailVO).getData());
    }

    @RequestMapping(value = "/queryTaskDailyList", method = RequestMethod.POST)
    public Result<List<UserTaskDailyVO>> queryTaskDailyList(@RequestHeader("UserId") String userId, @RequestBody TaskDailyQueryVO taskDailyQueryVO) {
        taskDailyQueryVO.setOwnerId(userId);
        return flagBindClient.queryTaskDailyList(taskDailyQueryVO);
    }

}
