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
        return flagClient.hello();
    }

//    @RequestMapping(value = "/queryFlags", method = RequestMethod.GET)
//    public Result<List<FlagQueryVO>> queryFlags(@RequestParam String userId) {
//        return flagClient.queryFlags(userId);
//    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public Result<String> page(@RequestBody FlagDetailVO flagDetailVO) {
        System.out.println(flagDetailVO);
        return flagClient.addFlag(flagDetailVO);
    }

//    @RequestMapping(value = "/queryFlagList", method = RequestMethod.GET)
//    public Result<List<UserFlagVO>> queryFlagList(@RequestParam String userId,
//                                                  @RequestParam(required = false) Integer userType,
//                                                  @RequestParam(required = false) Integer flagType,
//                                                  @RequestParam(required = false) Integer flagStatus) {
//        return flagBindClient.queryFlagList(userId, userType, flagType, flagStatus);
//    }
    @RequestMapping(value = "/queryFlagList", method = RequestMethod.POST)
    public Result<List<UserFlagVO>> queryFlagList(@RequestHeader("UserId") String userId, @RequestBody FlagQueryVO flagQueryVO) {
        flagQueryVO.setOwnerId(userId);
        return flagBindClient.queryFlagList(flagQueryVO);
    }

   @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public Result<FlagDetailVO> getById(@PathVariable("id") String flagId) {
        Result<FlagDetailVO> response = flagClient.getByFlagId(flagId);
        return response;
    }
}
