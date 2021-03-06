package codecool.controller;

import codecool.dao.*;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class AppController {

    public void run() {

        Connection conn = setup();

        BookDao bookDao = new PSQLBookDao(conn);

        new RootController(bookDao, conn).run();

        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("  Error closing connection: " + e.getMessage());
        }
    }

    public Connection setup() {
        try (InputStream input = new FileInputStream("./src/main/resources/database.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            String databaseName = prop.getProperty("db.database");
            String user = prop.getProperty("db.user");
            String password = prop.getProperty("db.passwd");
            return new PostgresSQLDataSource(databaseName, user, password).connect();
        } catch (IOException e) {
            System.out.println("  The file doesn't exist!!!");
        }
        return null;
    }
}
