package repository;

import model.ProductDTO;
import model.ProductType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static final String SHOW_LIST = "call quan_ly();";
    private static final String ADD_PRODUCT = " insert into hang_hoa(ma_hang_hoa, ten_hang_hoa, don_vi, gia, " +
            " id_loai_hang_hoa, ngay_thu_hoach,is_delete) values (?,?,?,?,?,?,0);";
    private static final String FIND_ID = "select * from hang_hoa where id = ?;";
    private static final String REMOVE_PRODUCT = "update hang_hoa set is_delete = 1 where hang_hoa.id=?;";

    @Override
    public List<ProductDTO> showList() {
        List<ProductDTO> list = new ArrayList<>();
        Connection connection = BaseGameRepository.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall(SHOW_LIST);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String code = resultSet.getString("ma_hang_hoa");
                String name = resultSet.getString("ten_hang_hoa");
                String unit = resultSet.getString("don_vi");
                double price = resultSet.getDouble("gia");
                String typeName = resultSet.getString("ten_loai_hang_hoa");
                String date = resultSet.getString("ngay_thu_hoach");
                list.add(new ProductDTO(id, code, name, unit, price, typeName, date));
            }
        } catch (SQLException e) {

        }
        return list;
    }

    @Override
    public void addNew(ProductDTO productDTO) {
        Connection connection = BaseGameRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_PRODUCT);
            preparedStatement.setString(1, productDTO.getCode());
            preparedStatement.setString(2, productDTO.getName());
            preparedStatement.setString(3, productDTO.getUnit());
            preparedStatement.setDouble(4, productDTO.getPrice());
            preparedStatement.setInt(5, productDTO.getTypeId());
            preparedStatement.setString(6, productDTO.getDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ProductType> getAllProductType() {
        List<ProductType> productTypes = new ArrayList<>();
        Connection connection = BaseGameRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(" select * from loai_hang_hoa ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("ten_loai_hang_hoa");
                ProductType productType = new ProductType(id, name);
                productTypes.add(productType);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return productTypes;
    }

    @Override
    public ProductDTO findById(int id) {
        ProductDTO productDTO = null;
        Connection connection = BaseGameRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String code = resultSet.getString("ma_hang_hoa");
                String name = resultSet.getString("ten_hang_hoa");
                String unit = resultSet.getString("don_vi");
                double price = resultSet.getDouble("gia");
                int typeId = resultSet.getInt("id_loai_hang_hoa");
                String date = resultSet.getString("ngay_thu_hoach");
                productDTO = new ProductDTO(id, code, name, unit, price, typeId, date);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productDTO;
    }

    @Override
    public boolean removeProduct(int id) {
        boolean rowRemove = false;
        Connection connection = BaseGameRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_PRODUCT);
            preparedStatement.setInt(1, id);
            rowRemove = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowRemove;
    }
}
