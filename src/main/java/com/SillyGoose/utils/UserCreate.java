package com.SillyGoose.utils;

import com.SillyGoose.bean.CollectTime;
import com.SillyGoose.bean.Goose;
import com.SillyGoose.bean.User;
import com.SillyGoose.service.Impl.CollectTimeServiceImpl;
import com.SillyGoose.service.Impl.GooseServiceImpl;
import com.SillyGoose.service.Impl.UserServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

public class UserCreate {

    private UserServiceImpl userService;

    private GooseServiceImpl gooseService;

    private CollectTimeServiceImpl collectTimeService;

    private CollectTime collectTime;

    private Goose goose;

    private User user;

    public boolean createUser(int userId, String userPasswd,
                              String userPhone, String userName){
        Boolean res = false;

        Date currentDate = new Date();

        user = new User(userId,userName,userPasswd,userPhone);
        collectTime = new CollectTime(userId);
        goose = new Goose(userId);
        collectTime.InitTime(currentDate);
        goose.InitGoose();

        if(userService.createUser(user)){
            gooseService.syncCreate(goose);
            collectTimeService.syncCreate(collectTime);
            res = true;
        }

        return res;
    }

}
