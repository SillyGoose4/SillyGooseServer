package com.SillyGoose.service.Impl;

import com.SillyGoose.bean.CollectTime;
import com.SillyGoose.dao.CollectTimeMapper;
import com.SillyGoose.service.CollectTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CollectTimeService")
public class CollectTimeServiceImpl implements CollectTimeService {

    @Autowired
    CollectTimeMapper collectTimeMapper;

    public void syncCreate(CollectTime collectTime) {
        collectTimeMapper.insert(collectTime);
    }
}
