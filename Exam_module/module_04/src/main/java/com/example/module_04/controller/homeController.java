package com.example.module_04.controller;

import com.example.module_04.model.City;
import com.example.module_04.model.Country;
import com.example.module_04.service.ICityService;
import com.example.module_04.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class homeController {
    @Autowired
    private ICityService iCityService;
    @Autowired
    private ICountryService iCountryService;

    @ModelAttribute("countries")
    public List<Country> countries() {
        return (List<Country>) this.iCountryService.findAll();
    }

    @GetMapping("/")
    public String home(Model model) {
        Iterable<City> cities = iCityService.findAll();
        model.addAttribute("cities", cities);
        return "/home";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("city", new City());
        return "/create";
    }

    @PostMapping("/create")
    public String createCity(City city) {
        this.iCityService.save(city);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showFormEdit(@PathVariable Integer id, Model model) {
        model.addAttribute("country", iCountryService.findAll());
        return new ModelAndView("edit", "city", this.iCityService.findById(id));
    }

    @PostMapping("/{id}/edit")
    public String updateCity(@ModelAttribute City city) {
        this.iCityService.save(city);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView showFormDelete(@PathVariable Integer id, Model model) {
        model.addAttribute("country", iCountryService.findAll());
        return new ModelAndView("delete", "city", this.iCityService.findById(id));
    }

    @PostMapping("/{id}/delete")
    public String deleteCity(@PathVariable Integer id) {
        this.iCityService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/views")
    public ModelAndView details(@PathVariable Integer id,Model model){
        model.addAttribute("country", iCountryService.findAll());
        return new ModelAndView("views", "city", this.iCityService.findById(id));
    }

}
