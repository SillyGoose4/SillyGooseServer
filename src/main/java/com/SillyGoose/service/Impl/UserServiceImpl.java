package com.SillyGoose.service.Impl;

import com.SillyGoose.bean.User;
import com.SillyGoose.dao.UserMapper;
import com.SillyGoose.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 以ID为索引查询数据
     * @param id 索引
     * @return
     */
    public User getUserById(Long id) {

        return userMapper.selectByPrimaryKey(id);
    }
}
