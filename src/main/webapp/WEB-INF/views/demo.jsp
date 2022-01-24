<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DEMO JSTL</title>
</head>
<body>
<h1>
Name of the Student is: ${name}  <br>
Branch of the Student is: ${branch}  <br>
Marks : ${marks}<br>
<hr>
	<c:forEach var="i" items="${marks}">
		${i}
	</c:forEach>
</h1>


</body>
</html>