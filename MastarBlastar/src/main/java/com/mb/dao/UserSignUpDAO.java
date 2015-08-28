package com.mb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mb.connection.ConnectionPool;
import com.mb.pojo.UserDetails;

public class UserSignUpDAO {

private Connection connection;
	
	public UserSignUpDAO(){
		
		connection = ConnectionPool.getConnection();
		
	}
	public int saveUser(UserDetails signupData){
		
		int indicator = 0;
		String saveCustomerQuery = "insert into user_table values(?,?,?,?,?,?)";
		try {
			PreparedStatement ptmt = connection.prepareStatement(saveCustomerQuery);
			ptmt.setString(1, signupData.getName());
			ptmt.setString(2, signupData.getEmployeeid());
			ptmt.setString(3, signupData.getPassword());
			ptmt.setString(4, signupData.getEmail());
			ptmt.setString(5, signupData.getSupemail());
			ptmt.setString(6, signupData.getProject());
			indicator = ptmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Exception" + e);
		}
		return indicator;
		
		
	}
	public String checkLogin(UserDetails userDetails) {
		// TODO Auto-generated method stub
		int indicator =0;
		String getCustomerQuery = "select count(*) AS total from user_table where "
				+ "employeeid ="+userDetails.getEmployeeid()+" and password ="+ userDetails.getPassword();
		System.out.println("Query formed is..." + getCustomerQuery);
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(getCustomerQuery);
			System.out.println("inside DAO");
			
			while(resultSet.next()){
				indicator = resultSet.getInt("total");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Indicator is....  " + indicator);
		if(indicator == 0){
			return "notavailable";
		}
		else{
			return "available";
		}
	}
}
