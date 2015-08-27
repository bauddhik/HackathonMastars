package com.mb.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {

	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/";
    private  static String dbName = "mastarblastar";
    private static  String userName = "root";
    private static String password = "admin";
    private volatile static Connection connection = null;
    
    /**
     * This method provide a single instance of connection.
     * @return connection
     */
    public static Connection getConnection(){
    	if(connection == null){
    		synchronized (ConnectionPool.class){
    			if(connection == null){
    				connection = createConnection();
    			}
    		}

    	}
    	if(connection != null){
    	System.out.println("Connection is Established");
    	}else{
    		System.out.println("Connection is Not Established");
    	}
    	
    	return connection;

    }
    
    /**
     * This method will create connection with my sql.
     * @return connection
     */
    private static Connection createConnection(){
    	
    	Connection conn = null;
    	try {
    		Class.forName(driverName);
    		conn = DriverManager.getConnection(url+dbName,userName,password);
    	} catch (ClassNotFoundException e) {

    		System.out.println(e.getMessage());
    	}
    	catch (SQLException e) {

    		System.out.println(e.getMessage());
    	}
    	
    	return conn;
    }
}
