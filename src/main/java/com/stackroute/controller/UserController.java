package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/")//for mappint the http request from the dipacther servelet
    public String mo(){
        return "index";
    }

    @RequestMapping("/Login")//for mapping the http requests from the dispactcher servlet
    public ModelAndView modelAndView(@ModelAttribute("userName") String userName){
        ModelAndView modelAndView=new ModelAndView();
        User user=new User();
        user.setName(userName);
        System.out.println(user.getName());
        modelAndView.addObject("result",user.getName());
        modelAndView.setViewName("Login");
        return modelAndView;
    }
}
