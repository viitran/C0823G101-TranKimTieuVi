package com.example.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount-servlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        double ListPrice = Double.parseDouble(req.getParameter("price"));
        double percent = Double.parseDouble(req.getParameter("percent"));
        double amount = ListPrice * percent * 0.01;
        double price = (ListPrice * 0.01) / amount;
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");

        req.setAttribute("amount", amount);
        req.setAttribute("price", price);
        req.setAttribute("description",description);
        req.setAttribute("name",name);
        requestDispatcher.forward(req, resp);

//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("<html>");
//        printWriter.println("description product: " + description);
//        printWriter.println("discount amount: " + amount + "discount price: " + price);
//        printWriter.println("</html>");
    }
}
