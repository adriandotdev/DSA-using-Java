package com.fundamentals.sqlpractice;

import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) {

//        String url = "jdbc:mysql://localhost:3306/parkncharge_v3";
//        String username = "root";
//        String password = "4332wurx";
//        String query = "" +
//                "SELECT" +
//                "*" +
//                "FROM" +
//                "users WHERE username = ?";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        }
//        catch(ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Connection conn = DatabaseConfig.getDataSource().getConnection();
//
//            DatabaseConfig.printPoolStats(DatabaseConfig.getDataSource());
//
//            PreparedStatement stmt = conn.prepareStatement(query);
//
//            stmt.setString(1, "httpdotjs");
//
//            ResultSet result = stmt.executeQuery();
//
//            while (result.next()) {
//
//                System.out.println(result.getString("username") + " " + result.getString("password"));
//            }
//
//            DatabaseConfig.printPoolStats(DatabaseConfig.getDataSource());
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
    }
}
