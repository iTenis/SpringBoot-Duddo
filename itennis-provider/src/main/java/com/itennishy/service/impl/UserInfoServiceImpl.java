package com.itennishy.service.impl;

import com.itennishy.domain.UserInfo;
import com.itennishy.service.UserInfoService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0",application = "${dubbo.application.id}",protocol = "${dubbo.protocol.id}",registry = "${dubbo.registry.id}")
public class UserInfoServiceImpl implements UserInfoService {

//    private UserInfo userInfo;

    @Override
    public String GetUserByName(String name) {
        return name;
    }
}
