<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign UP</title>
</head>
<body>
<s:form action="register">   
<s:textfield style="border-radius:4px;" name="signUp.name" label="Name"></s:textfield>
<s:textfield name="signUp.employeeid" label="Employee Id"></s:textfield>    
<s:password name="signUp.password" label="Password"></s:password>  
<s:textfield name="signUp.email" label="Email"></s:textfield>  
<s:textfield name="signUp.supemail" label="Supervisor Email"></s:textfield>  
<s:select cssStyle="width:155px;" list="{'MASTARS','FLPS','IMPACTS'}"  name="signUp.project" label="Project"></s:select>  
<s:submit value="Register"></s:submit>  
</s:form> 
</body>
</html>