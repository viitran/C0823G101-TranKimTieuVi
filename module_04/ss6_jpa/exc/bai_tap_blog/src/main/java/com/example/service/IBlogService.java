package com.example.service;

import com.example.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> showList();
    void add(Blog blog);
    Blog findById(int id);
    void update(int id,Blog blog);
    void remove(int id);
}
