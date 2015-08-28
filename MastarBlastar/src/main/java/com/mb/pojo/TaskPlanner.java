
public class TaskPlanner {
private String taskName;
private String startTime;
private String stopTime;
private String actualTime;
private String estimatedTime;

public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}

public void setStartTime(String startTime){
	this.startTime = startTime;
}
 
public String getStartTime(){
	return startTime;
}

public void setStopTime(String stopTime){
	this.stopTime = stopTime;
}

public String getStopTime(){
	return this.stopTime;
}


public void setActualTime(String actualTime){
	
	return actualTime;
}
	
public String getActualTime(){
	return actualTime;
}

public void setEstimatedTime(String estimatedTime){
	this.estimatedTime = estimatedTime;
	
}

public String getEstimatedTime(){
	return this.estimatedTime;
}
}