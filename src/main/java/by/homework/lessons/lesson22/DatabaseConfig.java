package by.homework.lessons.lesson22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ppuchinsky
 */
public class DatabaseConfig {
//    private static final String URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;TRACE_LEVEL_SYSTEM_OUT=2";
    private static final String URL = "jdbc:postgresql://localhost:5432/app";
//    private static final String USER = "sa";
    private static final String USER = "postgres";
//    private static final String PASSWORD = "";
    private static final String PASSWORD = "postgres";
    private final Connection connection;

    private static DatabaseConfig INSTANCE;

    private DatabaseConfig() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DatabaseConfig getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConfig();
        }
        return INSTANCE;
    }

    public Connection getConnection() throws SQLException {
        return connection;
    }

    public void initializeDatabase() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
//            String createTableSQL = "CREATE TABLE student (" +
//                    "id INT PRIMARY KEY AUTO_INCREMENT," +
//                    "name VARCHAR(255)," +
//                    "age INT" +
//                    ")";
            String createTableSQL = "CREATE TABLE IF NOT EXISTS student (" +
                    "id SERIAL PRIMARY KEY," +
                    "name VARCHAR(255)," +
                    "age INT" +
                    ")";

            statement.execute(createTableSQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
