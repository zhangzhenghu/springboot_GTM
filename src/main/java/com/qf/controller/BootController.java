package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BootController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public String selectAll(){
        List<User> userList = userService.selectAll();
        return  userList.toString();
    }
}
