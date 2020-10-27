package com.luoys.upgrade.flagweb.client;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.FlagVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "flag", url = "http://localhost:9002")
public interface FlagClient {

    @RequestMapping(value = "/flag/queryFlags", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<FlagVO>> page(@RequestParam String userId);

    @RequestMapping(value = "/flag/hello", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> hello();
}
