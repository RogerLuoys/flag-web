package com.luoys.upgrade.flagweb.web;
import com.luoys.upgrade.flagweb.client.FlagClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.FlagVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flag")
@Slf4j
public class FlagController {

    @Autowired
    private FlagClient flagClient;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Result<List<FlagVO>> page(String userId) {
        return flagClient.page(userId);
    }

}
