package com.example.myblog.service;


import com.example.myblog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Comparator;

public interface IBlogService extends IGenerateService<Blog> {
    Page<Blog> find(Pageable pageable, String name);
    Comparator<Blog> sort(Blog b,Blog b2);
}
