package com.luoys.upgrade.flagweb.client;
import com.luoys.common.api.Result;
import com.luoys.upgrade.flagweb.vo.FlagDetailVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface FlagClient {

    @RequestMapping(value = "/flag/newFlag", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> newFlag(@RequestBody FlagDetailVO flagDetailVO);

    @RequestMapping(value = "/flag/queryFlagDetail", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<FlagDetailVO> queryFlagDetail(@RequestParam(value = "flagId") String flagId);

    @RequestMapping(value = "/flag/modifyFlagStatus", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> modifyFlagStatus(@RequestParam("flagId") String flagId, @RequestParam("status") Integer status);

    @RequestMapping(value = "/flag/removeFlag", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> removeFlag(@RequestParam("flagId") String flagId);

    @RequestMapping(value = "/flag/modifyFlagBasic", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> modifyFlagBasic(@RequestBody FlagDetailVO flagDetailVO);

}
