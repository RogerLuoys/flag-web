package com.luoys.upgrade.flagweb.client;

import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.UserInfoVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "flag", url = "http://localhost:9002")
public interface UserClient {

    @RequestMapping(value = "/user/login", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<UserInfoVO> login(@RequestParam("loginName") String loginName, @RequestParam("password") String password);

    @RequestMapping(value = "/user/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<Integer> register(@RequestBody UserInfoVO userInfoVO);

    @RequestMapping(value = "/user/modifyUser", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<Integer> modifyUser(@RequestBody UserInfoVO userInfoVO);
}
