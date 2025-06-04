<%@ page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home Page</title>
</head>
<body>
	<h1>
        JSP 2x 
        EL (Expression Language) 
        JSTL JSP Standard Tag Library
    </h1>
    <h1>Name: ${name}</h1>

    <h2>Friend List:</h2>
    <ul>
        <c:forEach var="friend" items="${friendlist}">
            <li>${friend}</li>
        </c:forEach>
    </ul>

</body>
</html>
