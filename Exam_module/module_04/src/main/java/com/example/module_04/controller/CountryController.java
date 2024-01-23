package com.example.module_04.controller;

import com.example.module_04.model.Country;
import com.example.module_04.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
    @Autowired
    private ICountryService iCountryService;
    @GetMapping("/country")
    public String country(Model model){
        Iterable<Country> countries = this.iCountryService.findAll();
        model.addAttribute("countries",countries);
        return "/listCountry";
    }
}
