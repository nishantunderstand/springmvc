<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
		List<String> friends1 = (List<String>) request.getAttribute("friendlist");
	%>

	<h1>
		name
		<%=name %>
	</h1>


	<h1>
		<%  
			for(String s:friends1)
				out.println(s);
		%>
	</h1>

</body>
</html>

