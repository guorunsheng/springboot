package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.lang.Integer;

/**
 * create by Rision on 2018/7/3
 */
/*@Controller
@RequestMapping(value = "/user")*/
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/show")
    public List<User> getUser(Integer userId){
        return userService.getUser(userId);
    }


    /*//@Autowired
    UserService userService;

    @ResponseBody
    @PostMapping("/add")
    //@RequestMapping("/add")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    //@GetMapping("/all")
    @RequestMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }*/
}
