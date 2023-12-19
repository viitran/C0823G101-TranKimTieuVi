package service;

import model.ProductDTO;
import model.ProductType;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<ProductDTO> showList() {
        return productRepository.showList();
    }

    @Override
    public void addNew(ProductDTO productDTO) {
        productRepository.addNew(productDTO);
    }

    @Override
    public List<ProductType> getAllProductType() {
        return this.productRepository.getAllProductType();
    }

    @Override
    public ProductDTO findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public boolean removeProduct(int id) {
        return productRepository.removeProduct(id);
    }
}
