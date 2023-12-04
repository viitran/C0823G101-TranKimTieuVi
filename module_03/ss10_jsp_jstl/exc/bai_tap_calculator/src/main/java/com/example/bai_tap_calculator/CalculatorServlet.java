package com.example.bai_tap_calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",value = "/calculator-servlet")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            float firstOperand = Float.parseFloat(req.getParameter("first-operand"));
            float secondOperand = Float.parseFloat(req.getParameter("second-operand"));
            char operator = req.getParameter("operation").charAt(0);
            float result = Calculator.calculate(firstOperand,secondOperand,operator);
            req.setAttribute("result",result);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(req,resp);
        }catch (Exception e){
            e.getMessage();
        }
    }
}
