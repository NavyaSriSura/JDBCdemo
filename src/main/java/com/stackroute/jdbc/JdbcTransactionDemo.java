package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTransactionDemo
{
    public void getTransactionDetails()
    { try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Root@123");
        connection.setAutoCommit(false);

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("insert into Employeetbl values(5,'abhi',20,'m')");
        stmt.executeUpdate("insert into Employeetbl values(6,'uday',21,'m')");

        connection.commit();
        connection.close();
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
    }
}
