package com.SillyGoose.service.Impl;

import com.SillyGoose.bean.Pic;
import com.SillyGoose.dao.PicMapper;
import com.SillyGoose.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PicService")
public class PicServiceImpl implements PicService {

    @Autowired
    private PicMapper picMapper;

    public void insertPic(Pic record) {
        picMapper.insert(record);
    }
}
