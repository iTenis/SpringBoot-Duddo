package com.itennishy.controller;

import com.itennishy.domain.UserInfo;
import com.itennishy.service.UserInfoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Reference(version = "1.0.0")
    private UserInfoService userInfoService;

    @GetMapping("/get")
    public UserInfo GetUserByName(String name){
        return userInfoService.GetUserByName(name);
    }
}
