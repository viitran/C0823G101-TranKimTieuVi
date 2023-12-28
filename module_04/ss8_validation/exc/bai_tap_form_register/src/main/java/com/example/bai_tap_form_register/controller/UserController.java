package com.example.bai_tap_form_register.controller;

import com.example.bai_tap_form_register.model.User;
import com.example.bai_tap_form_register.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/")
    public String addList(Model model) {
        model.addAttribute("user", new User());
        return "/create";
    }

    @PostMapping("/validation")
    public String checkValidation(@Validated @ModelAttribute("user") User user,
                                        BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        }
        iUserService.save(user);
        return ("/result");
    }
}
