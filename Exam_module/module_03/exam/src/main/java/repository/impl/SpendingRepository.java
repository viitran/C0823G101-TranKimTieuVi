package repository.impl;

import model.SpendingDTO;
import model.SpendingType;
import repository.BaseRepository;
import repository.ISpendingRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SpendingRepository implements ISpendingRepository {
    private static final String GET_ALL = "call lich_su_chi_tieu();";
    private static final String ADD_NEW = "insert into chi_tieu(ten_chi_tieu, ngay_chi, so_tien_chi, id_loai_chi, mo_ta_them)\n" +
            "VALUES (?,?,?,?,?);";
    private static final String SHOW_TYPE = "select * from loai_chi;";
    private static final String REMOVE = "update chi_tieu set is_delete = 1 where id = ?;";

    @Override
    public List<SpendingDTO> showList() {
        List<SpendingDTO> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall(GET_ALL);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("ten_chi_tieu");
                String date = resultSet.getString("ngay_chi");
                Double price = resultSet.getDouble("so_tien_chi");
                String type = resultSet.getString("ten_loai_chi");
                String description = resultSet.getString("mo_ta_them");
                list.add(new SpendingDTO(id, name, date, price, type, description));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void addNew(SpendingDTO spendingDTO) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW);
            preparedStatement.setString(1, spendingDTO.getName());
            preparedStatement.setString(2, spendingDTO.getDate());
            preparedStatement.setDouble(3, spendingDTO.getPrice());
            preparedStatement.setInt(4, spendingDTO.getTypeId());
            preparedStatement.setString(5, spendingDTO.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<SpendingType> showType() {
        List<SpendingType> typeList = null;
        Connection connection = BaseRepository.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall(SHOW_TYPE);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_loai_chi");
                String name = resultSet.getString("ten_loai_chi");
                SpendingType spendingType = new SpendingType(id,name);
                typeList.add(spendingType);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return typeList;
    }

    @Override
    public boolean removeSpending(int id) {
        boolean rowRemove = false;
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(REMOVE);
            preparedStatement.setInt(1, id);
            rowRemove = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowRemove;
    }
}
