<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>
<s:if test="loginStatus=='available'">

Bauddhik <s:property value='loginStatus'/>

<p>
Daily Task Planner
</p>

<s:form action="taskPlannerAction">

<table style="border: 1px solid black;" cellpadding="6" cellspacing="0">
  <tr valign="baseline" bgcolor="#404060">
    <th align="center"> Task </th>
    <th align="left"> Start Time </th>
    <th align="left"> Stop Time </th>
    <th align="center"> Actual Time Spent </th>
    <th align="left"> Estimated Time </th>
  </tr>
<tr>
<td><s:textfield name="taskPlanner.taskName" id="taskName"/></td>
<td><s:textfield name="taskPlanner.startTime" id="startTime"/></td>
<td><s:textfield name="taskPlanner.stopTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.actualTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.estimatedTime" id="estimatedTime" />
<td><s:submit cssStyle="float:left; margin-top:10px; margin-left:180px; border:none; background-color:red; color:white; font-weight:bold; height:35px; border-radius:4px;" value="SAVE REPORT"></s:submit></td>
</tr>
<tr>
<td><s:textfield name="taskPlanner.taskName" id="taskName"/></td>
<td><s:textfield name="taskPlanner.startTime" id="startTime"/></td>
<td><s:textfield name="taskPlanner.stopTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.actualTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.estimatedTime" id="estimatedTime" />
<td><s:submit cssStyle="float:left; margin-top:10px; margin-left:180px; border:none; background-color:red; color:white; font-weight:bold; height:35px; border-radius:4px;" value="SAVE REPORT"></s:submit></td>
</tr>
<tr>
<td><s:textfield name="taskPlanner.taskName" id="taskName"/></td>
<td><s:textfield name="taskPlanner.startTime" id="startTime"/></td>
<td><s:textfield name="taskPlanner.stopTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.actualTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.estimatedTime" id="estimatedTime" />
<td><s:submit cssStyle="float:left; margin-top:10px; margin-left:180px; border:none; background-color:red; color:white; font-weight:bold; height:35px; border-radius:4px;" value="SAVE REPORT"></s:submit></td>
</tr>
<tr>
<td><s:textfield name="taskPlanner.taskName" id="taskName"/></td>
<td><s:textfield name="taskPlanner.startTime" id="startTime"/></td>
<td><s:textfield name="taskPlanner.stopTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.actualTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.estimatedTime" id="estimatedTime" />
<td><s:submit cssStyle="float:left; margin-top:10px; margin-left:180px; border:none; background-color:red; color:white; font-weight:bold; height:35px; border-radius:4px;" value="SAVE REPORT"></s:submit></td>
</tr>
<tr>
<td><s:textfield name="taskPlanner.taskName" id="taskName"/></td>
<td><s:textfield name="taskPlanner.startTime" id="startTime"/></td>
<td><s:textfield name="taskPlanner.stopTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.actualTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.estimatedTime" id="estimatedTime" />
<td><s:submit cssStyle="float:left; margin-top:10px; margin-left:180px; border:none; background-color:red; color:white; font-weight:bold; height:35px; border-radius:4px;" value="SAVE REPORT"></s:submit></td>
</tr>
<tr>
<td><s:textfield name="taskPlanner.taskName" id="taskName"/></td>
<td><s:textfield name="taskPlanner.startTime" id="startTime"/></td>
<td><s:textfield name="taskPlanner.stopTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.actualTime" id="stopTime"/></td>
<td><s:textfield name="taskPlanner.estimatedTime" id="estimatedTime" />
<td><s:submit cssStyle="float:left; margin-top:10px; margin-left:180px; border:none; background-color:red; color:white; font-weight:bold; height:35px; border-radius:4px;" value="SAVE REPORT"></s:submit></td>
</tr>
</table>
</s:form>
</s:if>
<s:else>
<%  
     response.sendRedirect("/pages/LoginPage.jsp?action=loginFailed");  
    %> 
</s:else>
</body>

</html>
