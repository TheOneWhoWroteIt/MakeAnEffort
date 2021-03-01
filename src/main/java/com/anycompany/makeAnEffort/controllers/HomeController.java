package com.anycompany.makeAnEffort.controllers;

import com.anycompany.makeAnEffort.entities.User;
import com.anycompany.makeAnEffort.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HomeController {

    private final UserService userService;

    @GetMapping("/hello")
    public String showHomePage(Model model){

        String login = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userService.findByLogin(login);

        model.addAttribute("user", user);

        return "hello";
    }

    @PostMapping("/hello")
    public String actionHomePage(){
        return "redirect:/hello";
    }
}
