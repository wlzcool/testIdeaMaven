package com.zhiguogongfang.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "demo")
public class DemoController {
    private static final Logger logger = LogManager.getLogger(DemoController.class);

    @RequestMapping(path = "index", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        logger.info("Index 方法被调用");

        return "Hello Spring";
    }

    @RequestMapping(path = "test", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView testModelAndView() {
        logger.info("testModelAndView 方法被调用");

        ModelAndView mv = new ModelAndView();
        mv.addObject("Message", "Hello ModelAndView");
        mv.setViewName("/WEB-INF/Views/Demo/welcome.jsp");
        return mv;
    }

    @RequestMapping(path = "testView", method = RequestMethod.GET)
    public String testView(Model model) {
        logger.info("testView 方法被调用");
        model.addAttribute("Message", "hello world");
        return "/Demo/welcome";
    }
}
