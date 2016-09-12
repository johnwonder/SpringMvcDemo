package com.john.controller;
import com.john.model.UserEntity;
import com.john.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by john on 2016/9/12.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
     public String index(){
         return  "index";
     }

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/admin/users",method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap){

        List<UserEntity> userList = userRepository.findAll();

        modelMap.addAttribute("userList",userList);

        return  "admin/users";
    }
}
