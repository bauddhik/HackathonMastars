
public class TaskPlannerAction extends ActionSupport implements SessionAware{
TaskPlanner taskPlanner;

public void execute(){
	System.out.println("taskPlanner  taskName:"+taskPlanner.getTaskName());
}

}
