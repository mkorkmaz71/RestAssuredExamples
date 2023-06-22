package com.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseDemo {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://18.118.14.155:3306/digitalbank";
        //register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //create connection
        Connection con= DriverManager.getConnection(url,"digitaluser","Demo123!");
        //create object of statement
        Statement stmt= con.createStatement();
        //executequerry
        ResultSet rs=stmt.executeQuery("select name from account");
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
    }
}
