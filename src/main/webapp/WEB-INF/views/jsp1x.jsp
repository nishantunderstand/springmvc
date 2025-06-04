<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home Page</title>
</head>
<body>
	<h1> JSP 1x Scriplet </h1>
	
    <%
        String name = (String) request.getAttribute("name");
        List<String> friends1 = (List<String>) request.getAttribute("friendlist");
    %>

    <h1>Name: <%= name %></h1>

    <h2>Friend List:</h2>
    <ul>
    <%
        for(String s : friends1) {
    %>
        <li><%= s %></li>
    <%
        }
    %>
    </ul>
</body>
</html>
