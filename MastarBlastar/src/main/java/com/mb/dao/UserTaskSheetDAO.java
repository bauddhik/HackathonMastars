package com.mb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mb.connection.ConnectionPool;
import com.mb.pojo.TaskPlanner;

public class UserTaskSheetDAO {

	private Connection connection;
	public UserTaskSheetDAO(){
		connection = ConnectionPool.getConnection();
	}
	
	public int saveUserTask(TaskPlanner taskPlanner){
		
		int indicator = 0;
		String saveCustomerQuery = "insert into user_task_sheet values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ptmt = connection.prepareStatement(saveCustomerQuery);
			
			/*ptmt.setString(1, signupData.getName());
			ptmt.setString(2, signupData.getEmployeeid());
			ptmt.setString(3, signupData.getPassword());
			ptmt.setString(4, signupData.getEmail());
			ptmt.setString(5, signupData.getSupemail());
			ptmt.setString(6, signupData.getProject());*/
			indicator = ptmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Exception" + e);
		}
		return indicator;
				
	}
}
