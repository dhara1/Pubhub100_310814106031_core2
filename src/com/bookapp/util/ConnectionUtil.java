package com.bookapp.util;
import java.sql.DriverManager;
import java.sql.Connection;
public class ConnectionUtil {
	public static Connection getConnection() throws Exception{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapp_db", "root","root");
       return connection;
	}      
}
