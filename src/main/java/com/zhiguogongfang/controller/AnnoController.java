package com.zhiguogongfang.controller;

import com.zhiguogongfang.Dto.UserDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "anno")
public class AnnoController {
    private static final Logger logger = LogManager.getLogger(AnnoController.class);

    @RequestMapping(path = "showresult")
    public String ShowResult(UserDto user) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        logger.info(user.getFirstName());
        logger.info(user.getLastName());
        return "/Anno/showresult";
    }

    @RequestMapping(path = "showparamresult")
    public String ShowParamResult(String firstName, String LastName) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("FirstName", firstName);
        mv.addObject("lastName", LastName);
        logger.info(firstName);
        logger.info(LastName);
        return "/Anno/showparamresult";
    }

    @RequestMapping(path = "testrequestparam")
    public String TestRequestParam(
            @RequestParam("firstName") String firstName, @RequestParam("lastName") String LastName) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("FirstName", firstName);
        mv.addObject("lastName", LastName);
        logger.info(firstName);
        logger.info(LastName);
        return "/Anno/testrequestparam";
    }

    @RequestMapping(path = "testdefaultparam")
    public String TestDefaultParam(
            @RequestParam("firstName") String firstName,
            @RequestParam(value = "lastName", defaultValue = "lingzhi") String LastName) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("FirstName", firstName);
        mv.addObject("lastName", LastName);
        logger.info(firstName);
        logger.info(LastName);
        return "/Anno/testdafaultparam";
    }

    @RequestMapping(path = "testreqeustheader")
    public String TestRequestHeader(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader(value = "Accept") String[] accepts) {
        logger.info(userAgent);
        for (String accept : accepts) {
            logger.info(accept);
        }
        logger.info(accepts);
        return "/Anno/testreqeustheader";
    }

    @RequestMapping(path = "testcookies")
    @ResponseBody
    public String TestCookies(
            @CookieValue("JSESSIONID") String sessionId) {
        logger.info(sessionId);

        return sessionId;
    }
    @RequestMapping("/session/test/{firstName}/{lastName}")
    public ModelAndView localsessionAttributes(@PathVariable String firstName,
                                               @PathVariable String lastName,HttpSession session){
        session.setAttribute("currentUser", new UserDto(firstName,lastName));
        ModelAndView mav = new ModelAndView("session");
        return mav;
    }


    @RequestMapping(path = "index")
    public String Index() {
        return "/Anno/index";
    }

    @RequestMapping(path = "getjson")
    @ResponseBody
    public String GetJson(String name, String time) {
        return "name:" + name + "time:" + time;
    }

    @RequestMapping(path = "testjson")
    @ResponseBody
    public String TestJson(String name, String time) {
        return "name:" + name + "time:" + time;
    }
}
