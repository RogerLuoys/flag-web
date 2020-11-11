package com.luoys.upgrade.flagweb.client;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.FlagDetailVO;
import com.luoys.upgrade.flagweb.vo.FlagQueryVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface FlagClient {

    @RequestMapping(value = "/flag/hello", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> hello();

    @RequestMapping(value = "/flag/queryFlags", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<FlagQueryVO>> queryFlags(@RequestParam String userId);

    @RequestMapping(value = "/flag/addFlag", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> addFlag(@RequestBody FlagDetailVO flagDetailVO);

    @RequestMapping(value = "/flag/detail/", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<FlagDetailVO> getByFlagId(@RequestParam String flagId);
}
