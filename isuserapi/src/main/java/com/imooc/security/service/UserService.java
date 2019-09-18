package com.imooc.security.service;

import com.imooc.security.dto.UserInfo;
import com.imooc.security.entity.User;

import java.util.List;

public interface UserService {
    List<User> findUsersByName(String name);

    UserInfo create(UserInfo userInfo);
}
