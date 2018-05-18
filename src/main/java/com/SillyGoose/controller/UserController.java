package com.SillyGoose.controller;

import com.SillyGoose.bean.User;
import com.SillyGoose.service.Impl.UserServiceImpl;
import com.SillyGoose.service.UserService;
import com.SillyGoose.utils.MessageBox;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserService userService;


}
