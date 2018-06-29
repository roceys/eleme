package com.roceys.org.web;

import java.sql.*;

public class SqliteTest {
    public static void main(String args[]) {
        Connection conn = null;
        ResultSet resultSet = null;
        Statement statement = null;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:D:\\SQLiteStudio\\eleme");
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select * from Test");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("text"));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                resultSet.close();
                statement.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
