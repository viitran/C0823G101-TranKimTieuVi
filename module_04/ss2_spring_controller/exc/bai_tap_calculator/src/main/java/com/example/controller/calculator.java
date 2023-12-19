package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculator {

    @GetMapping("/")
    public String home(){
        return "/calculator";
    }

    @GetMapping("/calculator")
    public String calculation(@RequestParam String calculation,@RequestParam double firstNumb, @RequestParam double secondNumb, Model model){
         double result = 0;
        switch (calculation){
            case "Addition":
                result = firstNumb + secondNumb;
                break;
            case "Subtraction":
                result = firstNumb - secondNumb;
                break;
            case "Multiplication":
                result = firstNumb * secondNumb;
                break;
            case "Division":
                if (secondNumb == 0){
                    model.addAttribute("result","can't division by zero!!");
                    return "/calculator";
                }
                result = firstNumb / secondNumb;
                break;
        }
        model.addAttribute("calculation",calculation);
        model.addAttribute("result",result);
        return "/calculator";
    }
}
