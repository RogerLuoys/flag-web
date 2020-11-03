package com.luoys.upgrade.flagweb.web;

import com.luoys.upgrade.flagweb.client.FlagClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.FlagQueryVO;
import com.luoys.upgrade.flagweb.vo.FlagVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flag")
@Slf4j
public class FlagController {

    @Autowired
    private FlagClient flagClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Result<String> hello() {
//        return Result.success("test");
        return flagClient.hello();
    }

    @RequestMapping(value = "/queryFlags", method = RequestMethod.GET)
    public Result<List<FlagQueryVO>> queryFlags(@RequestParam String userId) {
        return flagClient.queryFlags(userId);
    }

    @RequestMapping(value = "/addFlag", method = RequestMethod.POST)
    public Result<String> page(@RequestBody FlagVO flagVO) {
        System.out.println(flagVO);
        return flagClient.addFlag(flagVO);
    }

}
