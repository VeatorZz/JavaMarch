package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户表的服务层
 */
@Service
public class UserService {
    @Autowired
    private UserService userService;

    private UserMapper userMapper;
    public  int add(String username,String password){

         return userMapper.add(username,password   );
    }
    public UserInfo login(String username,String password){
        return userMapper.login(username,password);
    }
}
