package com.luoys.upgrade.flagweb.web;

import com.luoys.upgrade.flagweb.client.TemplateClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/template")
@Slf4j
@CrossOrigin
public class TemplateController {

    @Autowired
    private TemplateClient templateClient;


    @RequestMapping(value = "/queryFlagTemplateDetail/{id}", method = RequestMethod.GET)
    public Result<FlagTemplateDetailVO> queryFlagTemplateDetail(@PathVariable("id") String flagTemplateId) {
        return templateClient.queryFlagTemplateDetail(flagTemplateId);
    }

    @RequestMapping(value = "/queryFlagTemplateList", method = RequestMethod.GET)
    public Result<List<FlagTemplateVO>> queryFlagTemplateList(@RequestHeader("userId") String userId, @RequestParam(value = "flagName", required = false) String flagName) {
        return templateClient.queryFlagTemplateList("1", flagName);
    }

    @RequestMapping(value = "/useFlagTemplate", method = RequestMethod.POST)
    public Result<String> useFlagTemplate(@RequestHeader("userId") String userId, @RequestBody FlagTemplateDetailVO flagTemplateDetailVO) {
        flagTemplateDetailVO.setOwnerId(userId);
        return templateClient.useFlagTemplate(flagTemplateDetailVO);
    }

}
