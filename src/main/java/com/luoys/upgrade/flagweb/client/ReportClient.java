package com.luoys.upgrade.flagweb.client;

import com.luoys.common.api.Result;
import com.luoys.upgrade.flagweb.vo.ReportVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface ReportClient {


    @RequestMapping(value = "/report/queryReportDetail", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<ReportVO> queryReportDetail(@RequestParam("flagId") String flagId);

}
