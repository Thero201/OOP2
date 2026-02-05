package kz.aitu.OOP2.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/sportsclub";
    private static final String USER = "postgres";
    private static final String PASSWORD = "08032007";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
