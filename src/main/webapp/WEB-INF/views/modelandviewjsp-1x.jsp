<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.List" %> 
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Model And View - Scriptlet Version</title>
</head>
<body>

    <%
        String name = (String) request.getAttribute("name");
        int rollNumber = (Integer) request.getAttribute("rollnumber");
        LocalDateTime time = (LocalDateTime) request.getAttribute("time");
        List<Integer> marks = (List<Integer>) request.getAttribute("marks");
    %>

    <h1>MODEL-AND-VIEW using Scriptlet</h1>

    <h2>Name: <%= name %></h2>
    <h2>Roll Number: <%= rollNumber %></h2>
    <h2>Time: <%= time %></h2>

    <h3>Marks List:</h3>
    <ul>
        <% for (Integer mark : marks) { %>
            <li><%= mark %></li>
        <% } %>
    </ul>

</body>
</html>
