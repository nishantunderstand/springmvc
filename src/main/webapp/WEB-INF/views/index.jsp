<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index.jsp</title>
</head>
<body>
	<h1>WEB-INF/views/index.jsp</h1>


	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("friendlist");
	%>
	
	<%
		for(String s:friends)
		{
			out.println(s);
		}
		
	%>
	


</body>
</html>

