package com.stackroute.jdbc;

import com.mysql.cj.result.Row;

import java.sql.SQLException;


public class App 
{
    public static void main( String[] args ) throws Exception {

        JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
        jdbcBatchDemo.executeBatchquery();

        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        simpleJdbcDemo.getEmployeeDetails();
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("navya","f");


        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.getDetailsWithRowset();

        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
        resultSetMetadataDemo.getDetailsWithResultSetMetaData();

        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
        databaseMetadataDemo.getDetailsWithDatabaseMetaData();

        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.getTransactionDetails();


    }
}
