package com.mb.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.mb.dao.UserSignUpDAO;
import com.mb.pojo.UserDetails;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport implements SessionAware{
	
	private UserDetails userDetails;
	private String loginStatus;
	private String employeeId;
	private SessionMap<String,Object> sessionMap;
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sessionMap = (SessionMap<String, Object>) map;
		
	}
	
	public String execute() {
		UserSignUpDAO user = new UserSignUpDAO();
		loginStatus = user.checkLogin(userDetails);
		employeeId = userDetails.getEmployeeid();
		sessionMap.put("employeeId", employeeId);
		return "SUCCESS";
	}
}
