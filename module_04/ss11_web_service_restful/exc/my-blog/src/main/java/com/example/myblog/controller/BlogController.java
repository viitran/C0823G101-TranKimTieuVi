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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
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
    public ResponseEntity<List<Category>> showList(Model model,
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
        if (getAllCategories().isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(getAllCategories(),HttpStatus.OK);
    }

    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> findAll(Model model){
        List<Blog> blogs = iBlogService.findAll();
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Category> saveCate(@RequestBody Category category){
        return new ResponseEntity<>(this.iCategoryService.save(category),HttpStatus.OK);
    }

    @PostMapping("/addBlog")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(this.iBlogService.save(blog),HttpStatus.OK);
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
        model.addAttribute("blog", iBlogService.findById(id));
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
        model.addAttribute("blog", iBlogService.findById(id));
        return "/details";
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> detailsBlog(@RequestBody Integer id){
        Blog blogs = iBlogService.findById(id);
        if (blogs == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }

}
