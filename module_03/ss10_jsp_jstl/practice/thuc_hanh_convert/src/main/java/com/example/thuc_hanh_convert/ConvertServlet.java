package com.example.thuc_hanh_convert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ConvertServlet", value = "/convert-servlet")
public class ConvertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double rate = Double.parseDouble(req.getParameter("rate"));
        double usd = Double.parseDouble(req.getParameter("usd"));
        double result = rate * usd;
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        req.setAttribute("result", result);
        requestDispatcher.forward(req, resp);
    }
}
