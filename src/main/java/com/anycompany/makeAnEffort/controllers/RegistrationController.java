package com.anycompany.makeAnEffort.controllers;

import com.anycompany.makeAnEffort.dto.UserDTO;
import com.anycompany.makeAnEffort.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RegistrationController {

    private final UserService userService;

    @GetMapping("/registration")
    public String showRegistrationPage(Model model){

        model.addAttribute("userDTO", new UserDTO());
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationUser(@Valid @ModelAttribute(name = "userDTO") UserDTO userDTO,
                           BindingResult result){

        if(result.hasErrors()){
            return "registration";
        }

        userService.saveUser(userDTO);

        return "redirect:/login";

    }
}
