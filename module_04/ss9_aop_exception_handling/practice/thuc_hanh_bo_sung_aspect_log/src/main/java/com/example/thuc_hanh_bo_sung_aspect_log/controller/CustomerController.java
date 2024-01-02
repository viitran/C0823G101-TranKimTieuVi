package com.example.thuc_hanh_bo_sung_aspect_log.controller;


import com.example.thuc_hanh_bo_sung_aspect_log.model.Customer;
import com.example.thuc_hanh_bo_sung_aspect_log.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Customer> customers = (List<Customer>) this.iCustomerService.findAll();
        model.addAttribute("customers", customers);
        return "/home";
    }

    @GetMapping("/create")
    public String formCreate(Model model) {
        model.addAttribute("customers", new Customer());
        return "/create";
    }

    @PostMapping("/create")
    public String createBlog(@ModelAttribute("customers") Customer customer) {
        this.iCustomerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("customers", iCustomerService.findById(id).get());
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(Customer customer){
        iCustomerService.save(customer);
        return "redirect:/";
    }


    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customers", iCustomerService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Customer customer) {
        int id = customer.getId();
        iCustomerService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/details")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iCustomerService.findById(id).orElse(new Customer()));
        return "/details";
    }

}
