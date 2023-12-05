package com.example.bai_tap_management_product.controller;

import com.example.bai_tap_management_product.model.Product;
import com.example.bai_tap_management_product.service.IProductService;
import com.example.bai_tap_management_product.service.impl.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = {"","/product-servlet"})
public class ProductServlet extends HttpServlet {

    private IProductService iProductService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                formCreate(req, resp);
                break;
            case "delete":
                formDelete(req, resp);
                break;
            case "edit":
                formEdit(req,resp);
                break;
            case "details":
                formDetails(req,resp);
                break;
            case "search":
                formSearchProduct(req,resp);
                break;
            default:
                showList(req, resp);
        }
    }

    private void formSearchProduct(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/search.jsp");
        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void formDetails(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product products = iProductService.findById(id);
        RequestDispatcher requestDispatcher;
        if (products != null){
            req.setAttribute("products",products);
            requestDispatcher = req.getRequestDispatcher("/details.jsp");
            try {
                requestDispatcher.forward(req,resp);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void formEdit(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product products = iProductService.findById(id);
        RequestDispatcher requestDispatcher;
        if (products != null){
            req.setAttribute("products",products);
            requestDispatcher = req.getRequestDispatcher("/edit.jsp");
            try {
                requestDispatcher.forward(req,resp);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void formDelete(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product products = iProductService.findById(id);
        RequestDispatcher requestDispatcher;
        if (products != null) {
            req.setAttribute("products", products);
            requestDispatcher  = req.getRequestDispatcher("/delete.jsp");
            try {
                requestDispatcher.forward(req, resp);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void formCreate(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/create.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addNewProduct(req, resp);
                break;
            case "delete":
                removeProduct(req, resp);
                break;
            case "edit":
                editProduct(req,resp);
                break;
            case "search":
                searchByName(req,resp);
                break;
        }
    }

    private void searchByName(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("search");
        List<Product> products = iProductService.search(name);
        if (products !=null){
            req.setAttribute("products",products);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/search.jsp");
            try {
                requestDispatcher.forward(req,resp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void editProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String producer = req.getParameter("producer");
        Product product = iProductService.findById(id);
        if (product!= null){
            product.setName(name);
            product.setPrice(price);
            product.setDescription(description);
            product.setProducer(producer);
            iProductService.editProduct(product,id);
            req.setAttribute("product",product);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/edit.jsp");
            try {
                requestDispatcher.forward(req,resp);
                resp.sendRedirect("/product-servlet");
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void removeProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = iProductService.findById(id);
        if (product != null) {
            iProductService.deleteProduct(id);
            try {
                resp.sendRedirect("/product-servlet");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    private void addNewProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String producer = req.getParameter("producer");
        iProductService.addNewProduct(new Product(id, name, price, description, producer));
        try {
            resp.sendRedirect("/product-servlet");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void showList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = iProductService.showList();
        req.setAttribute("products", products);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view.jsp");
        requestDispatcher.forward(req, resp);
    }
}
