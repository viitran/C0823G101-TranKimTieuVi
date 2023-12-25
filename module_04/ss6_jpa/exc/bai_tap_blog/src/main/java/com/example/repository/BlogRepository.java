package com.example.repository;

import com.example.model.Blog;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BlogRepository implements IBlogRepository{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Blog> showList() {
        String show = "";
        TypedQuery<Blog> typedQuery = entityManager.createNamedQuery(show, Blog.class);
        return typedQuery.getResultList();
    }

    @Override
    public void add(Blog blog) {
        entityManager.persist(blog);
    }

    @Override
    public Blog findById(int id) {
        String findId = "select b from Blog b where b.id = :id";
        TypedQuery<Blog> query = entityManager.createQuery(findId, Blog.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void update(int id, Blog blog) {
        blog = findById(id);
        entityManager.merge(blog);
    }

    @Override
    public void remove(int id) {
        Blog blog = findById(id);
        if (blog != null){
            entityManager.remove(blog);
        }
    }
}
