package com.luoys.upgrade.flagweb.web;

import com.luoys.upgrade.flagweb.client.FlagBindClient;
import com.luoys.upgrade.flagweb.client.FlagClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.FlagDetailVO;
import com.luoys.upgrade.flagweb.vo.FlagQueryVO;
import com.luoys.upgrade.flagweb.vo.UserFlagVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Result<String> newFlag(@RequestHeader("UserId") String userId, @RequestBody FlagDetailVO flagDetailVO) {
        flagDetailVO.setOwnerId(userId);
        return flagClient.newFlag(flagDetailVO);
    }

    @RequestMapping(value = "/queryFlagList", method = RequestMethod.POST)
    public Result<List<UserFlagVO>> queryFlagList(@RequestHeader("UserId") String userId, @RequestBody FlagQueryVO flagQueryVO) {
        flagQueryVO.setOwnerId(userId);
        return flagBindClient.queryFlagList(flagQueryVO);
    }

   @RequestMapping(value = "/queryFlagDetail/{id}", method = RequestMethod.GET)
    public Result<FlagDetailVO> queryFlagDetail(@PathVariable("id") String flagId) {
        Result<FlagDetailVO> response = flagClient.queryFlagDetail(flagId);
        return response;
    }

    @RequestMapping(value = "/modifyFlagStatus", method = RequestMethod.PUT)
    public Result<FlagDetailVO> modifyFlagStatus(@RequestParam("flagId") String flagId, @RequestParam("status") Integer status) {
        Result<FlagDetailVO> response = flagClient.modifyFlagStatus(flagId, status);
        return response;
    }

    @RequestMapping(value = "/removeFlag", method = RequestMethod.DELETE)
    public Result<FlagDetailVO> removeFlag(@RequestParam("flagId") String flagId) {
        Result<FlagDetailVO> response = flagClient.removeFlag(flagId);
        return response;
    }
}
