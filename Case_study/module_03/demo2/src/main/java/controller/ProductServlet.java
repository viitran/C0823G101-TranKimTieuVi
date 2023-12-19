package controller;

import model.ProductDTO;
import model.ProductType;
import service.IProductService;
import service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                List<ProductType> productTypes = this.iProductService.getAllProductType();
                req.setAttribute("productTypes", productTypes);
                req.getRequestDispatcher("create.jsp").forward(req, resp);
                break;
            default:
                showList(req, resp);
        }

    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProductDTO> list = iProductService.showList();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/view.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addNewProduct(req, resp);
                break;
            case "delete":
                deleteProduct(req, resp);
                break;
            default:
                showList(req, resp);
        }
    }

    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("idDelete"));
        iProductService.removeProduct(id);
        List<ProductDTO> list = iProductService.showList();
        req.setAttribute("list", list);
        try {
            req.getRequestDispatcher("/view.jsp").forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addNewProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String code = req.getParameter("code");
        String name = req.getParameter("name");
        String unit = req.getParameter("unit");
        double price = Double.parseDouble(req.getParameter("price"));
        String date = req.getParameter("date");
        int productTypeId = Integer.parseInt(req.getParameter("productType"));
        ProductDTO productDTO = new ProductDTO(code, name, unit, price, date, productTypeId);
        this.iProductService.addNew(productDTO);
        resp.sendRedirect("/product-servlet");
    }
}
