package com.SillyGoose.controller;

import com.SillyGoose.bean.User;
import com.SillyGoose.service.Impl.UserServiceImpl;
import com.SillyGoose.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(Long id){
        User user=userService.getUserById(id);
        return "list";
    }
}
