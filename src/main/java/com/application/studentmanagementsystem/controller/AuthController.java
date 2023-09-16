package com.application.studentmanagementsystem.controller;

import org.springframework.ui.Model;
import com.application.studentmanagementsystem.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    // handler method to handle home page request
    @GetMapping("/index")
    public String home(){
        return "index";
    }
    // handler method to handle user registration from request
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user",user);
        return "register";
    }
}
