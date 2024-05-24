<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is About Page</title>
</head>
<body>
	<h1>WEB-INF/views/help.jsp</h1>
	<h1>After Hitting the About help Page</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer rollnumber = (Integer) request.getAttribute("rollnumber");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>

	<h1>
		Name
		<%=name%></h1>
	<h1>
		RollNumber
		<%=rollnumber%></h1>
	<h1>
		Time<%=time%></h1>
	<!-- 
	In time we will have Exception , Why it not imported
	You need to import 
	<%@ page import="java.time.LocalDateTime" %>
	 
	
	-->
</body>
</html>