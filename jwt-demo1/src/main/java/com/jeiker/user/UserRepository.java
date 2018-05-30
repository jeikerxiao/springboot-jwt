package com.jeiker.user;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@Repository
public interface UserRepository {
    User findByUsername(final String username);
}
