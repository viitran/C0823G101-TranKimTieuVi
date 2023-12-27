package com.example.demo_spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaoTrapController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("b","Phương tệ, bảo điên");
        return "home";
    }
}
