package com.xlfd.user.api.impl;

import com.xlfd.user.api.TestUserService;
import com.xlfd.user.entity.TestUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther Allan
 * @date 2018/7/27 17:19
 */
@Service
public class TestUserServiceImpl implements TestUserService {
    @Override
    public TestUser get(String id) {
        TestUser user = new TestUser();
        user.setId("123");
        user.setName("小明");
        user.setSex("女");
        return user;
    }

    @Override
    public List<TestUser> getAll() {
        List<TestUser> list = new ArrayList<>();
        TestUser user = new TestUser();
        user.setId("123");
        user.setName("小明");
        user.setSex("女");

        TestUser user1 = new TestUser();
        user1.setId("1234");
        user1.setName("小明1");
        user1.setSex("男");

        list.add(user);
        list.add(user1);
        return list;
    }
}
