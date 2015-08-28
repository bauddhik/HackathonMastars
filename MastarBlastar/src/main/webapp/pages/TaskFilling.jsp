<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>

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
</tr>
</table>

</body>
</form>
</html>
