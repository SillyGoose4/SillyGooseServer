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
    @ResponseBody
    public JSONObject getUser(int id){
        User user=userService.getUserById(id);
        return JSONObject.parseObject(user.toString());
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
            // ID 使用什么？内部自建？
            //user.setUserId(jsonObject.getInteger("Phone").hashCode());
            user.setUserName(jsonObject.getString("Name"));
            user.setUserPhone(jsonObject.getString("Phone"));
            user.setUserPasswd(jsonObject.getString("Passwd"));
            if(userService.insert(user) == 0){
                messageBox = MessageBox.SU_FAIL;
            }else{
                messageBox = MessageBox.SU_SUCCESS;
            }
        }else if(jsonObject.getString("Value").equals("SIGNIN")){
            User user = userService.getUserById(jsonObject.getInteger("Phone"));
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
