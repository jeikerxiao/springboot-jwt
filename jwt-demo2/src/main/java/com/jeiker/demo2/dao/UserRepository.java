package com.jeiker.demo2.dao;

import com.jeiker.demo2.model.User;
import org.springframework.stereotype.Component;

/**
 * Description: 用户表操作接口
 * Created by jeikerxiao on 2018/6/5 上午9:21
 */
@Component
public interface UserRepository {

    /**
     * 通过用户名查找用户
     * @param username
     * @return
     */
    User findByUsername(String username);
}
