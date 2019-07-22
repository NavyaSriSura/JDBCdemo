package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcBatchDemo {
    public void executeBatchquery() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",
                    "root", "Root@123");
            Statement stmt = con.createStatement();
            stmt.addBatch("insert into Employeetbl values(7,'karthik',40,'m')");
            stmt.addBatch("insert into Employeetbl values(8,'maggi',50,'f')");

            stmt.executeBatch();//executing the batch
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
