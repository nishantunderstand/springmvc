<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${Header }</h1>
	<h1>${Desc}</h1>
	<hr>
	<!-- 
	Approach 1 @RequestParam
	Now the data is not Bind to this Variable 	
	<h1>${email}</h1>
	<h1>${userName}</h1>
	<h1>${password}</h1>
	 -->
	
	<!-- 
	Approach 2 @ModelAttribute
	Now the data is shared in the format of user 
	 -->
	 <h1>${user.email}</h1>
	 <h1>${user.userName}</h1>
	 <h1>${user.password}</h1>
		
</body>
</html>

