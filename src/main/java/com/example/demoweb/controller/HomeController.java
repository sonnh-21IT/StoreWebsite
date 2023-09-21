package com.example.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String index(){
        return "page/pages/home";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "page/pages/contact";
    }
    @RequestMapping("/cart")
    public String cart(){
        return "page/pages/cart";
    }
    @RequestMapping("/register")
    public String register(){
        return "page/pages/register";
    }
    @RequestMapping("/detail")
    public String detail(){
        return "page/pages/detail";
    }

}
