package com.example.myblog.controller;

import com.example.myblog.model.Blog;
import com.example.myblog.model.Category;
import com.example.myblog.service.IBlogService;
import com.example.myblog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @ModelAttribute("categories")
    public List<Category> getAllCategories() {
        return (List<Category>) iCategoryService.findAll();
    }

    @GetMapping("/")
    public String showList(Model model,
                           @RequestParam(
                                   value = "search",
                                   required = false,
                                   defaultValue = "") String name,
                           @RequestParam(
                                   value = "sortBy",
                                   required = false,
                                   defaultValue = "id") String sortBy,
                           @RequestParam(
                                   value = "sortDirection",
                                   required = false,
                                   defaultValue = "ASC") String sortDirection) {
        Pageable pageable = PageRequest.of(0, 3, Sort.Direction.valueOf(sortDirection), sortBy);
        Page<Blog> blogs = this.iBlogService.find(pageable, name);
        model.addAttribute("searchValue", name);
        model.addAttribute("blog", blogs);
        return "/home";
    }

    @GetMapping("/category")
    public String findAllCate(Model model){
        List<Category> categories =  getAllCategories();
        model.addAttribute("categories",categories);
        return "/category";
    }

    @GetMapping("/create")
    public String formCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public String createBlog(@ModelAttribute("blog") Blog blog) {
        this.iBlogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id).get());
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(Blog blog){
        iBlogService.save(blog);
        return "redirect:/";
    }


    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog) {
        int id = blog.getId();
        iBlogService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/details")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id).orElse(new Blog()));
        return "/details";
    }

}
