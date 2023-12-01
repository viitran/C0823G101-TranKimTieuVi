package com.example.thuc_hanh_tao_web_login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("password");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        if ("admin".equalsIgnoreCase(account) && "admin".equalsIgnoreCase(password)) {
            printWriter.println("<h1>Welcome admin to website<h1>");
        } else {
            printWriter.println("<h1> Login Error!! <h1>");
        }
        printWriter.println("</html>");
    }
}
