package config;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

private static final String URL="jdbc:mysql://127.0.0.1:3306/grage";
private static final String USER="root";
private static final String PASS="Abhishek@123";

public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL,USER,PASS);

}
}
