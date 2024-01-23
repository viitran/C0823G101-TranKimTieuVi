package com.example.myblog.controller;

import com.example.myblog.model.Blog;
import com.example.myblog.service.IBlogService;
import com.example.myblog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResfulController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;
    @GetMapping
    public ResponseEntity<List<Blog>> findAll(){
        return new ResponseEntity<>(iBlogService.findAll(), HttpStatus.OK);
    }
}
