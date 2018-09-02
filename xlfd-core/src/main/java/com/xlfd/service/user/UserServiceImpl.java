package com.xlfd.service.user;

import com.xlfd.api.entity.User;
import com.xlfd.api.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Allan
 * @date 2018/8/27 18:14
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String id) {
        return userMapper.getUser(id);
    }
}
