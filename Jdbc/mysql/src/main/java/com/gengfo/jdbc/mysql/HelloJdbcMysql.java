package com.gengfo.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbcMysql {

    static Connection conn = null;

    public static Connection getConnectionByJDBC() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Done");
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "sonar", "sonar");
        } catch (SQLException e) {
            System.out.println("");
            e.printStackTrace();
        }
        return conn;
    }

    public static void test() {
        String sql = "select * from user";
        getConnectionByJDBC();
        try {

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                System.out.println(username + "" + password);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {

            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        HelloJdbcMysql testjdbc = new HelloJdbcMysql();
        testjdbc.test();
    }
}
