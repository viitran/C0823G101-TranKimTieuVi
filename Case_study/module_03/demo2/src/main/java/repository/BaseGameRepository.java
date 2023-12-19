package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseGameRepository {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bai_tap_them_m3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    private BaseGameRepository() {
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println(BaseGameRepository.getConnection());
    }
}
