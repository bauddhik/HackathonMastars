package com.mb.action;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.exception.DRException;

import org.apache.struts2.interceptor.SessionAware;

import com.mb.connection.ConnectionPool;
import com.mb.pojo.TaskPlanner;
import com.opensymphony.xwork2.ActionSupport;


public class TaskPlannerAction extends ActionSupport implements SessionAware{
TaskPlanner taskPlanner;

@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setSession(Map<String, Object> arg0) {
	// TODO Auto-generated method stub
	
}
public TaskPlanner getTaskPlanner() {
	return taskPlanner;
}

public void setTaskPlanner(TaskPlanner taskPlanner) {
	this.taskPlanner = taskPlanner;
}

public void saveTask(){
	System.out.println("taskName::"+taskPlanner.getTaskName());
}



}
