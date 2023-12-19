package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/")
    public String home(){
        return "/sandwich";
    }

    @GetMapping("/save")
    public String save(@RequestParam(name = "condiments",defaultValue = "") String[] condiments,Model model){
        for (String c: condiments) {
            System.out.println(c);
        }
        model.addAttribute("result",condiments);
        return "/result";
    }

}
