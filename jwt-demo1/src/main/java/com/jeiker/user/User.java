package com.jeiker.user;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@Data
public class User {

    private String id;
    private String username;
    private String password;
    private String email;
    private Date lastPasswordResetDate;
    private List<String> roles;
}
