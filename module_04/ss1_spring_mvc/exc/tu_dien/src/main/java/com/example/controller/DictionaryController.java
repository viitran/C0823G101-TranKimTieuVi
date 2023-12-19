package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    @GetMapping("/")
    public String home(){
        return "/dictionary";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam(name = "search") String name, Model model){
        Map<String,String> map = new HashMap<>();
        map.put("dog","chó");
        map.put("cat","mèo");
        map.put("candy","kẹo");
        map.put("snack","bánh");
        model.addAttribute("result",map.get(name));
        return "/dictionary";
    }
}
