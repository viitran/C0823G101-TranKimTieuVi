package com.example.thuc_hanh_hotel_management.controller;

import com.example.thuc_hanh_hotel_management.model.Customer;
import com.example.thuc_hanh_hotel_management.service.CustomerService;
import com.example.thuc_hanh_hotel_management.service.ICustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer-servlet")
public class CustomerServlet extends HttpServlet {
    private  ICustomerService iCustomerService = new CustomerService();

    protected void showList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = iCustomerService.showList();
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view.jsp");
        req.setAttribute("customers", customers);
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                formCreate(req, resp);
                break;
            case "delete":
                formDelete(req,resp);
                break;
            case "edit":
                formEdit(req,resp);
            default:
                showList(req, resp);
        }
    }

    private void formDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/delete.jsp");
        requestDispatcher.forward(req,resp);
    }

    private void formEdit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/edit.jsp");
        requestDispatcher.forward(req,resp);
    }

    private void formCreate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/create.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addCustomer(req, resp);
                break;
            case "delete":
                removeCustomer(req,resp);
                break;
            case "edit":
                editCustomer(req,resp);
                break;
        }
    }

    private void addCustomer(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        iCustomerService.addCustomer(new Customer(name, email, address));
        try {
            resp.sendRedirect("/customer-servlet");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
