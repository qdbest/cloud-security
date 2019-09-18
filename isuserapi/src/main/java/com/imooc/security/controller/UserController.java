package com.imooc.security.controller;

import com.imooc.security.dto.UserInfo;
import com.imooc.security.entity.User;
import com.imooc.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserInfo create(@RequestBody UserInfo userInfo){
        return userService.create(userInfo);
    }

    @GetMapping
    public List<User> query(String name) {
        return userService.findUsersByName(name);
    }
}
