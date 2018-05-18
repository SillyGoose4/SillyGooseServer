package com.SillyGoose.service.Impl;

import com.SillyGoose.bean.Goose;
import com.SillyGoose.dao.GooseMapper;
import com.SillyGoose.service.GooseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GooseService")
public class GooseServiceImpl implements GooseService {

    @Autowired
    private GooseMapper gooseMapper;


    public void syncCreate(Goose goose) {
        gooseMapper.insert(goose);
    }
}
