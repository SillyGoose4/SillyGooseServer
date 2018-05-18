package com.SillyGoose.service.Impl;

import com.SillyGoose.bean.Goose;
import com.SillyGoose.bean.User;
import com.SillyGoose.dao.AlbumMapper;
import com.SillyGoose.dao.CollectTimeMapper;
import com.SillyGoose.dao.GooseMapper;
import com.SillyGoose.dao.UserMapper;
import com.SillyGoose.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public boolean createUser(User record) {
        if(userMapper.insert(record) != 0) {
            return true;
        }else{
            return false;
        }
    }
}
