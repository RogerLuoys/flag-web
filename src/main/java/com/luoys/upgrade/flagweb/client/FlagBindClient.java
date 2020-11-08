package com.luoys.upgrade.flagweb.client;

import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.UserFlagVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "flag", url = "http://localhost:9002", path = "/flagBind")
public interface FlagBindClient {

    @RequestMapping(value = "/queryUserFlag", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<UserFlagVO>> queryUserFlag(@RequestParam String userId,
                                                  @RequestParam(required = false) Integer userType,
                                                  @RequestParam(required = false) Integer flagType,
                                                  @RequestParam(required = false) Integer flagStatus);
}
