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

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GooseMapper gooseMapper;

    @Autowired
    private AlbumMapper albumMapper;

    @Autowired
    private CollectTimeMapper collectTimeMapper;

    /**
     * 以ID为索引查询数据
     * @param id 索引
     * @return
     */
    public User getUserById(int id) {

        return userMapper.selectByPrimaryKey(id);
    }

    public int insert(User record) {
        return userMapper.insert(record);
    }

    public boolean createUser(User record) {
        userMapper.insert()
        return true;
    }
}
