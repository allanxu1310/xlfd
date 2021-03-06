package com.xlfd.api.mapper.user;

import com.xlfd.api.entity.User;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

/**
 * @auther Allan
 * @date 2018/8/27 19:02
 */
@Mapper
public interface UserMapper {

    User getUser(@Param(value = "id") String id);
}
