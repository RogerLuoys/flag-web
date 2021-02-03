package com.luoys.upgrade.flagweb.web;

import com.luoys.upgrade.flagweb.client.UserClient;
import com.luoys.upgrade.flagweb.util.Result;
import com.luoys.upgrade.flagweb.vo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Slf4j
@CrossOrigin
public class UserController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    Result<UserInfoVO> login(@RequestHeader("loginName") String loginName, @RequestHeader("password") String password) {
        return userClient.login(loginName, password);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    Result<Integer> register(@RequestBody UserInfoVO userInfoVO) {
        return userClient.register(userInfoVO);
    }

    @RequestMapping(value = "/modifyUser", method = RequestMethod.PUT)
    Result<Integer> modifyUser(@RequestBody UserInfoVO userInfoVO){
        return userClient.modifyUser(userInfoVO);
    }
}