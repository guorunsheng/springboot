package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public Map<String,String> index(){
        Map map = new HashMap<String,String>();
        map.put("悟空","是只猴子");
        map.put("鲁班","是个英雄");
        return map;
    }
}
