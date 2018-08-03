package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
//@RestController//如果用这个的话，就不用下面的@ResponseBody了，这是为啥呢，进去@RestController可以看到已经集成了
public class IndexController {
    //@RequestMapping("/index1")
    //@RequestMapping(value = {"/index1","/show"},method = RequestMethod.GET)
    @GetMapping("/index")
    @ResponseBody
    public Map<String,String> index(){
        Map map = new HashMap<String,String>();
        map.put("悟空","是只猴子");
        map.put("鲁班","是个英雄");
        return map;
    }
    @RequestMapping("/index2")
   // @ResponseBody
    public String index2(){
        Map map = new HashMap<String,String>();
        map.put("悟空","是只猴子");
        map.put("鲁班","是个英雄");
        return "index.html";
    }
}
