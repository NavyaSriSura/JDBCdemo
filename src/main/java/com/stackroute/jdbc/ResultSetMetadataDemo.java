package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo
{
    public void getDetailsWithResultSetMetaData() throws Exception {
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Root@123");
        Statement stmt = connection.createStatement();
        String sqlQuery = "select * from Employeetbl";
        ResultSet rs = stmt.executeQuery(sqlQuery);
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        int columnCount = resultSetMetaData.getColumnCount();
        for (int i = 1; i <= columnCount; ++i) {
            System.out.println("***************");
            System.out.print("Column Name : " + resultSetMetaData.getColumnLabel(i) + " \n");
            System.out.print("Column Type : " + resultSetMetaData.getColumnType(i) + " \n");
            System.out.print("Column Class Name : " + resultSetMetaData.getColumnClassName(i) + " \n");
            System.out.print("Column Type Name :" + resultSetMetaData.getColumnTypeName(i) + " \n");
            System.out.println("Database Name : " + resultSetMetaData.getCatalogName(i));
        }

    }
}
