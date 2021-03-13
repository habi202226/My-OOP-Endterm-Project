package com.company.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    @Override

    // connection to postgre sql type database
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        //liink to database
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        try {
            // downdload driver
            Class.forName("org.postgresql.Driver");
            // get connection login and password
            return DriverManager.getConnection(connectionURL, "postgres", "1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}