package com.itennishy.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {

    private int id;
    private String username;
    private String password;
    private String desc;
}
