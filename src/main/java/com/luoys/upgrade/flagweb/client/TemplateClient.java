package com.luoys.upgrade.flagweb.client;

import com.luoys.common.api.Result;
import com.luoys.upgrade.flagweb.vo.FlagTemplateDetailVO;
import com.luoys.upgrade.flagweb.vo.FlagTemplateVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface TemplateClient {

    @RequestMapping(value = "/template/queryFlagTemplateDetail", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<FlagTemplateDetailVO> queryFlagTemplateDetail(@RequestParam(value = "flagTemplateId") String flagTemplateId);

    @RequestMapping(value = "/template/queryFlagTemplateList", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<List<FlagTemplateVO>> queryFlagTemplateList(@RequestParam("ownerId") String ownerId, @RequestParam("flagName") String flagName);

    @RequestMapping(value = "/template/useFlagTemplate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<String> useFlagTemplate(@RequestBody FlagTemplateDetailVO flagTemplateDetailVO);
}
