package com.example.controller;


import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    private ICustomerService iCustomerService = new CustomerService();

    @GetMapping("/")
    public String showList(Model model) {
        List<Customer> list = iCustomerService.showList();
        model.addAttribute("list", list);
        return "/list";
    }
}
