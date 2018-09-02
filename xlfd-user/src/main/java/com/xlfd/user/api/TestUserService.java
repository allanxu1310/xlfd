package com.xlfd.user.api;

import com.xlfd.user.entity.TestUser;

import java.util.List;

/**
 * test api
 * @auther Allan
 * @date 2018/7/27 17:07
 */
public interface TestUserService {

    TestUser get(String id);

    List<TestUser> getAll();
}
