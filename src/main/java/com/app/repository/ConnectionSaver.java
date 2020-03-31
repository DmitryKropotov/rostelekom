/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.repository;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mitya
 */
public class ConnectionSaver {
    
        private static Connection conn = null;

    static Connection getConnection() {
        if (conn != null) {
            return conn;
        }

        try {
            // db parameters
            String url = "jdbc:sqlite:colors.db";
            DriverManager.registerDriver(new JDBC());
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        createTableInDb("TSCVETA", Arrays.asList("id INTEGER NOT NULL", "color_number", "name", "PRIMARY KEY(\"id\")"));
        return conn;
    }

    private static void createTableInDb(String tableName, List<String> columns) {
        Statement statement  = null;
        String sql = "create table if not exists " + tableName + " (";
        for (int i = 0; i < columns.size(); i++) {
            sql = sql + columns.get(i);
            if (i < columns.size() - 1) {
                sql = sql + ", ";
            }
        }
        sql = sql + ");";

        try {
            statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
