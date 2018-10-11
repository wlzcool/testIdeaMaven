package com.zhiguogongfang.controller;

import com.zhiguogongfang.Dto.UserDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "anno")
public class AnnoController {
    private static final Logger logger = LogManager.getLogger(AnnoController.class);

    @RequestMapping(path = "showresult")
    public String ShowResult(UserDto user) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("User", user);
        logger.info(user.getFirstName());
        logger.info(user.getLastName());
        return "/Anno/showresult";
    }

    @RequestMapping(path = "index")
    public String Index() {
        return "/Anno/index";
    }
}
