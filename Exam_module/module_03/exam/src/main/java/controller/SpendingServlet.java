package controller;

import model.SpendingDTO;
import model.SpendingType;
import repository.ISpendingRepository;
import repository.impl.SpendingRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "SpendingServlet", value = "/spending-servlet")
public class SpendingServlet extends HttpServlet {
    private ISpendingRepository spendingRepository = new SpendingRepository();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    req.getRequestDispatcher("/view.jsp").forward(req,resp);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                showList(req, resp);
        }
    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<SpendingDTO> list = spendingRepository.showList();
        req.setAttribute("list", list);
        try {
            req.getRequestDispatcher("/view.jsp").forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                addNewSpending(req,resp);
                break;
            case "delete":
                removeSpending(req, resp);
                break;
            default:
                showList(req,resp);
        }
    }

    private void removeSpending(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("idDelete"));
        spendingRepository.removeSpending(id);
        resp.sendRedirect("/view.jsp");
    }

    private void addNewSpending(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String date = req.getParameter("date");
        Double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String type = req.getParameter("spendingType");
        SpendingDTO list = new SpendingDTO(name,date,price,description,type);
        spendingRepository.addNew(list);
        req.setAttribute("list",list);
        try {
            req.getRequestDispatcher("/view.jsp").forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}