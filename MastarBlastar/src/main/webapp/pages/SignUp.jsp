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
<table style="margin:auto;"> 
<tr>
<img src="Verizon-logo-big.jpg" alt="" width="100%" />
</tr>
<s:textfield cssStyle="border: 1px solid grey; border-radius:4px; margin:10px;" name="signUp.name" label="NAME"></s:textfield>
<s:textfield cssStyle="border: 1px solid grey; border-radius:4px; margin:10px;" name="signUp.employeeid" label="EMPLOYEE ID"></s:textfield>    
<s:password cssStyle="border: 1px solid grey; border-radius:4px; margin:10px;" name="signUp.password" label="PASSWORD"></s:password>  
<s:textfield cssStyle="border: 1px solid grey; border-radius:4px; margin:10px;" name="signUp.email" label="EMAIL"></s:textfield>  
<s:textfield cssStyle="border: 1px solid grey; border-radius:4px; margin:10px;" name="signUp.supemail" label="SUPERVISOR EMAIL"></s:textfield>  
<s:select cssStyle="border: 1px solid grey; border-radius:4px; margin:10px; width:145px" list="{'MASTARS','FLPS','IMPACTS'}"  name="signUp.project" label="PROJECT"></s:select>
<input type="button" value="LOGIN" />  
<s:submit cssStyle="float:left; margin-top:10px; margin-left:180px; border:none; background-color:red; color:white; font-weight:bold; height:35px; border-radius:4px;" value="REGISTER"></s:submit>  
</table>
</s:form> 
</body>
</html>