package com.example.repository;

import com.example.model.Product;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    static {
        try {
            sessionFactory = new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public List<Product> showList() {
//        String select = "select p from product as p ";
//        TypedQuery<Product> typedQuery = entityManager.createQuery(select, Product.class);
//        return typedQuery.getResultList();
        return null;
    }

    @Override
    public void addNewProduct(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Product> search(String name) {
        return null;
    }

    @Override
    public Product information(int id) {
        return null;
    }
}
