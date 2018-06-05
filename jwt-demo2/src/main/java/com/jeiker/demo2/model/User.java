package com.jeiker.demo2.model;

import lombok.Data;

import java.util.List;

/**
 * Description: 用户模型
 * Created by jeikerxiao on 2018/6/5 上午9:20
 */
@Data
public class User {

    private String id;
    private String username;
    private String password;
    private List<String> roles;
}
