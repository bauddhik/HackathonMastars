package com.mb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;

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
			HttpSession session = ServletActionContext.getRequest().getSession();
			if(session.getAttribute("employeeId") != null){
				ptmt.setString(1, (String) session.getAttribute("employeeId"));
			}
			else{
				ptmt.setString(1, "00000");
			}
			ptmt.setString(2,  taskPlanner.getTaskName());
			ptmt.setString(3,  "Description");
			ptmt.setTimestamp(4,  convertStringToTimestamp(taskPlanner.getStartTime()));
			if(StringUtils.isNotBlank(taskPlanner.getStopTime()))
			ptmt.setTimestamp(5,  convertStringToTimestamp(taskPlanner.getStopTime()));
			else
				ptmt.setTimestamp(5, null);
			
			if(StringUtils.isNotBlank(taskPlanner.getActualTime()))
			ptmt.setInt(6, Integer.parseInt(taskPlanner.getActualTime()));
			else
				ptmt.setInt(6, 0);
			
			ptmt.setInt(7, Integer.parseInt(taskPlanner.getEstimatedTime()));
		} catch (SQLException e) {
			System.out.println("Exception" + e);
		}
		return indicator;
				
	}
	
	public static Timestamp convertStringToTimestamp(String str_date) {
	    try {
	      DateFormat formatter;
	      formatter = new SimpleDateFormat("dd/MM/yyyy");
	      Date date = (Date) formatter.parse(str_date);
	      java.sql.Timestamp timeStampDate = new Timestamp(date.getTime());

	      return timeStampDate;
	    } catch (ParseException e) {
	      System.out.println("Exception :" + e);
	      return null;
	    }
	  }

}
