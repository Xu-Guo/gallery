package com.xuguo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView root(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("title","Gallery");
        return mav;
    }

    @RequestMapping("/login")
    public String login(){
        return "/login";
    }
}
