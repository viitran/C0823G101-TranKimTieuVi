package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CurrencyController {
    @GetMapping("/")
    public String home() {
        return "/currency";
    }

    @GetMapping("/calculator")
    public String currency(@RequestParam(required = true) double usd, Model model) {
        double vnd = usd * 24360;
        model.addAttribute("result", vnd);
        return "/currency";
    }
}
