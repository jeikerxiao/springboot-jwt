package com.jeiker.demo2.dao.impl;

import com.jeiker.demo2.dao.UserRepository;
import com.jeiker.demo2.model.User;
import org.springframework.stereotype.Repository;

/**
 * Description: jwt-demo1
 * Created by jeikerxiao on 2018/6/5 下午1:46
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
