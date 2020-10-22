package com.luoys.upgrade.client;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "his-member-service")
public interface FlagClient {

    @RequestMapping(value = "/wehmo/member/share/work/order/page", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<PageInfo<WorkOrderVO>> page(@RequestBody WorkOrderQueryVO queryVO);

}

