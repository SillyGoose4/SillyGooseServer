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

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(Long id){
        User user=userService.getUserById(id);
        return "list";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String Login(@RequestBody String data){
        MessageBox messageBox=null;
        System.out.println("=================================");
        System.out.println("data:"+data);
        JSONObject jsonObject=JSONObject.parseObject(data);
        if(jsonObject.getString("Value").equals("SIGNUP")){
            User user=new User();
            user.setUserId(jsonObject.getLong("Phone"));
            user.setUserName(jsonObject.getString("Name"));
            user.setUserPhone(jsonObject.getString("Phone"));
            user.setUserPasswd(jsonObject.getString("Passwd"));
            if(userService.insert(user) == 0){
                messageBox = MessageBox.SU_FAIL;
            }else{
                messageBox = MessageBox.SU_SUCCESS;
            }
        }else if(jsonObject.getString("Value").equals("SIGNIN")){
            User user = userService.getUserById(jsonObject.getLong("Phone"));
            if(user.getUserPasswd().equals(jsonObject.getString("Passwd"))){
                messageBox = MessageBox.SI_SUCCESS;
            }else if(user == null){
                messageBox = MessageBox.SI_NOTFIND;
            }else{
                messageBox = MessageBox.SU_FAIL;
            }
        }
        return messageBox.toString();
    }

}
