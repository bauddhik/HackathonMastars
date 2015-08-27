package com.mb.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class NewUserAction extends ActionSupport implements SessionAware{

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public String execute() {
		
		return "SUCCESS";
	}
}
