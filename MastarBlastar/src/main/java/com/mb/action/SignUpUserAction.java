package com.mb.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.mb.dao.UserSignUpDAO;
import com.mb.pojo.SignUpUser;
import com.opensymphony.xwork2.ActionSupport;

public class SignUpUserAction extends ActionSupport implements SessionAware{

	private SignUpUser signUp;
	private int indicator;
	
	public SignUpUser getSignUp() {
		return signUp;
	}

	public void setSignUp(SignUpUser signUp) {
		this.signUp = signUp;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public String execute() {
		UserSignUpDAO userDao = new UserSignUpDAO();
		indicator = userDao.saveUser(signUp);
		return "SUCCESS";
	}

	public int getIndicator() {
		return indicator;
	}

	public void setIndicator(int indicator) {
		this.indicator = indicator;
	}
}
