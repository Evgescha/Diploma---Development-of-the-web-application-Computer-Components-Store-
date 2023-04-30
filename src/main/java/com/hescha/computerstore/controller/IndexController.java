package com.hescha.computerstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String home() {
        return "redirect:/product";
    }

    @GetMapping("/404")
    public String page404() {
        return "404";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }

    @GetMapping("/shopping-cart")
    public String shoppingcart() {
        return "shopping-cart";
    }

    @GetMapping("/sign-in")
    public String sign() {
        return "sign-in";
    }
}
