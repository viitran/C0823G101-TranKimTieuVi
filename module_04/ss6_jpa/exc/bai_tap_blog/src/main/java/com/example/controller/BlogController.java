package com.example.controller;

import com.example.model.Blog;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/")
    public String home(Model model){
        List<Blog> blog = iBlogService.showList();
        model.addAttribute("blog",blog);
        return "/view";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog",new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Blog blog){
        iBlogService.add(blog);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable int id, Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Blog blog){
        iBlogService.update(blog.getId(), blog);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id,Model model){
        System.out.println(id);
        model.addAttribute("blog",iBlogService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog){
        int id = blog.getId();
        iBlogService.remove(id);
        return "redirect:/";
    }
    @GetMapping("/{id}/details")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/details";
    }

}
