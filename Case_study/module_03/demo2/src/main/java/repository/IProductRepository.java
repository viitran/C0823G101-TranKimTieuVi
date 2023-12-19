package repository;

import model.ProductDTO;
import model.ProductType;

import java.util.List;

public interface IProductRepository {
    List<ProductDTO> showList();
    void addNew(ProductDTO productDTO);

    List<ProductType> getAllProductType();

    ProductDTO findById(int id);
    boolean removeProduct(int id);
}
