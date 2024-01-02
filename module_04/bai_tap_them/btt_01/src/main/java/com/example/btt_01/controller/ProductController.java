package com.example.btt_01.controller;

import com.example.btt_01.model.Cart;
import com.example.btt_01.model.Category;
import com.example.btt_01.model.Product;
import com.example.btt_01.service.ICartService;
import com.example.btt_01.service.ICategoryService;
import com.example.btt_01.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private ICartService iCartService;

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
                                   defaultValue = "ASC") String sortDirection,
                           @RequestParam(
                                   value = "page",
                                   required = false,
                                   defaultValue = "") int page) {
        Pageable pageable = PageRequest.of(0, 7, Sort.Direction.valueOf(sortDirection), sortBy);
        Pageable pageable1 = PageRequest.of(page,5);
        Page<Product> products = this.iProductService.find(pageable, name);
        Page<Category> categories = this.iCategoryService.find(pageable1,name);
        List<Cart> carts = (List<Cart>) this.iCartService.findAll();
        model.addAttribute("searchValue", name);
        model.addAttribute("categories",categories);
        model.addAttribute("carts",carts);
        model.addAttribute("products", products);
        return "/home";
    }
    @GetMapping("/create")
    public String formCreate(Model model) {
        model.addAttribute("products", new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("products") Product product) {
        this.iProductService.save(product);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("products", iProductService.findById(id).get());
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(Product product){
        iProductService.save(product);
        return "redirect:/";
    }


    @GetMapping("/{id}/delete")
    public String formDelete(@PathVariable int id,Model model){
        model.addAttribute("products",iProductService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product) {
        int id = product.getId();
        iProductService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/details")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("products", iProductService.findById(id).orElse(new Product()));
        return "/details";
    }
}
