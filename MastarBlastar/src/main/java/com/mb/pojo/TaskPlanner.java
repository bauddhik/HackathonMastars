package com.mb.pojo;
public class TaskPlanner {

	private String taskName;
	private String employeeid;
public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
private String startTime;
private String taskDescription;
public String getTaskDescription() {
	return taskDescription;
}
public void setTaskDescription(String taskDescription) {
	this.taskDescription = taskDescription;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getStopTime() {
	return stopTime;
}
public void setStopTime(String stopTime) {
	this.stopTime = stopTime;
}
public String getActualTime() {
	return actualTime;
}
public void setActualTime(String actualTime) {
	this.actualTime = actualTime;
}
public String getEstimatedTime() {
	return estimatedTime;
}
public void setEstimatedTime(String estimatedTime) {
	this.estimatedTime = estimatedTime;
}
private String stopTime;
private String actualTime;
private String estimatedTime;
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}


}