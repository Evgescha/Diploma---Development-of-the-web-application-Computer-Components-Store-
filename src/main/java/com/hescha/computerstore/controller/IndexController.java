package com.hescha.computerstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String home(){
        return "home";
    }
    @GetMapping("/404")
    public String page404(){
        return "404";
    }
    @GetMapping("/category")
    public String category(){
        return "category";
    }
    @GetMapping("/checkout")
    public String checkout(){
        return "checkout";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }
    @GetMapping("/faq")
    public String faq(){
        return "faq";
    }
    @GetMapping("/home2")
    public String home2(){
        return "home2";
    }
    @GetMapping("/sing-in")
    public String singin(){
        return "sing-in";
    }
}
