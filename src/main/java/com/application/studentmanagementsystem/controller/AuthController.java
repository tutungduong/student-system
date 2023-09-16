package com.application.studentmanagementsystem.controller;

import com.application.studentmanagementsystem.service.UserService;
import org.springframework.ui.Model;
import com.application.studentmanagementsystem.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

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
    // handler method to handle user registration from submit request
    @PostMapping("/register/save")
    public String registration(@ModelAttribute("user") UserDto userDto){
        userService.saveUser(userDto);
        return "redirect:/register?success";
    }

}
