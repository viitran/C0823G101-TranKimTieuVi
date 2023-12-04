package com.example.bai_tap_management_product.controller;

import com.example.bai_tap_management_product.model.Product;
import com.example.bai_tap_management_product.service.IProductService;
import com.example.bai_tap_management_product.service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet",value = "/product-servlet")
public class ProductServlet extends HttpServlet {

    private IProductService iProductService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    private void showList(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Product> products = iProductService.showList();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/main-view.jsp");
        requestDispatcher.forward(request,response);
    }

}
