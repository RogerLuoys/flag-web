package com.luoys.upgrade.flagweb.web;

import com.luoys.common.api.PageInfo;
import com.luoys.common.api.Result;
import com.luoys.upgrade.flagweb.client.FlagBindClient;
import com.luoys.upgrade.flagweb.client.FlagClient;
import com.luoys.upgrade.flagweb.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flag")
@Slf4j
@CrossOrigin
public class FlagController {

    @Autowired
    private FlagClient flagClient;

    @Autowired
    private FlagBindClient flagBindClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Result<String> hello() {
//        return Result.success("test");
        return null;
    }

    @RequestMapping(value = "/newFlag", method = RequestMethod.POST)
    public Result<String> newFlag(@RequestHeader("userId") String userId, @RequestBody FlagDetailVO flagDetailVO) {
        flagDetailVO.setOwnerId(userId);
        return flagClient.newFlag(flagDetailVO);
    }

    @RequestMapping(value = "/queryFlagList", method = RequestMethod.POST)
    public Result<PageInfo<UserFlagVO>> queryFlagList(@RequestHeader("userId") String userId, @RequestBody FlagQueryVO flagQueryVO) {
        flagQueryVO.setOwnerId(userId);
        if (flagQueryVO.getFlagName() != null && flagQueryVO.getFlagName().equals("")) {
            flagQueryVO.setFlagName(null);
        }
        return flagBindClient.queryFlagList(flagQueryVO);
    }

    @RequestMapping(value = "/queryFlagDetail/{id}", method = RequestMethod.GET)
    public Result<FlagDetailVO> queryFlagDetail(@PathVariable("id") String flagId) {
        return flagClient.queryFlagDetail(flagId);
    }

    @RequestMapping(value = "/modifyFlagStatus", method = RequestMethod.PUT)
    public Result<String> modifyFlagStatus(@RequestParam("flagId") String flagId, @RequestParam("status") Integer status) {
        return flagClient.modifyFlagStatus(flagId, status);
    }

    @RequestMapping(value = "/removeFlag", method = RequestMethod.DELETE)
    public Result<String> removeFlag(@RequestParam("flagId") String flagId) {
        return flagClient.removeFlag(flagId);
    }


    @RequestMapping(value = "/modifyFlagBasic", method = RequestMethod.PUT)
    public Result<String> modifyFlagBasic(@RequestBody FlagDetailVO flagDetailVO) {
        return flagClient.modifyFlagBasic(flagDetailVO);
    }

    @RequestMapping(value = "/modifyFlagWitness", method = RequestMethod.PUT)
    public Result<String> modifyFlagWitness(@RequestBody FlagBindVO flagBindVO) {
        return flagBindClient.modifyWitness(flagBindVO);
    }
}
