package com.example.bai_tap_list_customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = {"","/customer-servlet"})
public class CustomerServlet extends HttpServlet {

    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "https://i.pinimg.com/564x/a8/c5/35/a8c5352c72d278eb300cabced593372f.jpg"));
        customers.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "https://i.pinimg.com/564x/d7/82/8d/d7828da6de1856d63a4e30ceb9ad257f.jpg"));
        customers.add(new Customer("Nguyễn Thái Hoà", "1983-08-22", "Nam Định", "https://i.pinimg.com/736x/3e/9f/c1/3e9fc19e93612f6bd530ac9bfbd16bd2.jpg"));
        customers.add(new Customer("Trần Đăng Khoa", "1983-08-19", "Hà Tây", "https://i.pinimg.com/564x/63/3a/03/633a03cc1135530ba05c56ef6c9f899d.jpg"));
        customers.add(new Customer("Nguyễn Đình Thi", "1983-08-17", "Hà Nội", "https://i.pinimg.com/564x/5f/c5/d0/5fc5d05b283bb9efc08698a4ca7605c3.jpg"));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("customers", customers);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}