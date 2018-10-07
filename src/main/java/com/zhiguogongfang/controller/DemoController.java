package com.zhiguogongfang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="demo")
public class DemoController  {
    @RequestMapping(path = "index",method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "Hello Spring";
    }
}
