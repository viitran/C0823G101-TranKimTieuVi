package com.example.myblog.service.impl;


import com.example.myblog.model.Blog;
import com.example.myblog.repository.IBlogRepository;
import com.example.myblog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> find(Pageable pageable, String name) {
        return iBlogRepository.findAllByName (pageable, "%" + name + "%");
    }

    @Override
    public Comparator<Blog> sort(Blog b, Blog b2) {
        return null;
    }

}
