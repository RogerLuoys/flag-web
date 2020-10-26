package com.luoys.upgrade.client;

import com.luoys.upgrade.util.Result;
import com.luoys.upgrade.vo.FlagVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "flag")
public interface FlagClient {

    @RequestMapping(value = "/flag/queryFlags", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<FlagVO>> page(@RequestBody String userId);

}

