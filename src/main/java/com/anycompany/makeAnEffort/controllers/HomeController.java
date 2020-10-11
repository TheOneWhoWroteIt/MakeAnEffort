package com.anycompany.makeAnEffort.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String showHomePage(){
        return "hello";
    }

    @PostMapping("/hello")
    public String actionHomePage(){
        return "redirect:/hello";
    }
}
