package com.dky.eureka.service.impl;

import com.dky.eureka.domain.user.entity.User;
import com.dky.eureka.persistence.user.UserMapper;
import com.dky.eureka.service.IUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.findAll();
    }
}

