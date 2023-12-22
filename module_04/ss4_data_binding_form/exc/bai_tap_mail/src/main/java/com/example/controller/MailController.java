package com.example.controller;

import com.example.model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailController {

    @GetMapping("/")
    public String getConfigForm(Model model) {
        model.addAttribute("config", new Mail());
        return "/home";
    }

    @PostMapping("/config")
    public String saveConfig(Mail config, Model model) {
        model.addAttribute("config",config);
        return "/home";
    }
}
