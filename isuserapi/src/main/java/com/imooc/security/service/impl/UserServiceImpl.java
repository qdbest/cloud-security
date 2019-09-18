package com.imooc.security.service.impl;

import com.imooc.security.dto.UserInfo;
import com.imooc.security.entity.User;
import com.imooc.security.repository.UserRepository;
import com.imooc.security.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findUsersByName(String name) {
        return userRepository.findUsersByName(name);
    }

    @Override
    public UserInfo create(UserInfo userInfo) {

        if(userInfo!=null){
            User user = new User();
            BeanUtils.copyProperties(userInfo,user);
            userRepository.save(user);
            userInfo.setId(user.getId());
        }
        return userInfo;
    }
}
