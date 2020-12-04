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

    @RequestMapping(value = "/flag/newFlag", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> newFlag(@RequestBody FlagDetailVO flagDetailVO);

    @RequestMapping(value = "/flag/queryFlagDetail", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<FlagDetailVO> queryFlagDetail(@RequestParam(value = "flagId") String flagId);

    @RequestMapping(value = "/flag/modifyFlagStatus", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<FlagDetailVO> modifyFlagStatus(@RequestParam("flagId") String flagId, @RequestParam("status") Integer status);
}
