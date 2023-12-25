package com.example.service;

import com.example.model.Blog;
import com.example.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> showList() {
        return iBlogRepository.showList();
    }

    @Override
    public void add(Blog blog) {
        iBlogRepository.add(blog);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void update(int id, Blog blog) {
        iBlogRepository.update(id, blog);
    }

    @Override
    public void remove(int id) {
        iBlogRepository.remove(id);
    }
}
