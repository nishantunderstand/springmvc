<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@page import="java.time.LocalDateTime"%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!--
Don't Get Happy that Your Expression Is Running
You are using JSL Version 1.2
Update to Version 2.0
https://mkyong.com/spring-mvc/modelandviews-model-value-is-not-displayed-in-jsp-via-el/
  -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

</head>
<body>

	<%
	String	name= (String) request.getAttribute("name");
	Integer rollnumber = (Integer) request.getAttribute("rollnumber");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	<h1>Name ${name}</h1>
	<h1>RollNumber ${rollnumber}</h1>
	<h1>Time ${time}</h1>
	<hr>
	${marks}
	
	<!-- This is JSTL 
	To Use this Install JSTL Depedency in pom.xml and taglib
	  -->
	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>
		
	</c:forEach>
	
	
</body>
</html>


<!-- 
Old Approach

	<h1>
	Hello My Name is  <%=name %>
	</h1>
	<h1>
	My Roll Number is <%=rollnumber %>
	</h1>
	
	<h1>
		Current Time is <%=time %>
	</h1>
	

 -->