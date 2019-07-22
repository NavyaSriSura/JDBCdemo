package com.stackroute.jdbc;

import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import com.sun.rowset.JdbcRowSetImpl;
public class RowSetDemo {
    public void getDetailsWithRowset() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Creating and Executing RowSet
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",
                    "root", "Root@123");
            JdbcRowSet rowSet = new JdbcRowSetImpl(connection);
           // rowSet = RowSetProvider.newFactory().createJdbcRowSet();


            rowSet.setCommand("select * from Employeetbl");
            rowSet.execute();

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.print("  Id: " + rowSet.getString(1));
                System.out.print("  Name: " + rowSet.getString(2));
                System.out.println("  Age: " + rowSet.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}


