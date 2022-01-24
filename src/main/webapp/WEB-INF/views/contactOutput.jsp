<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Output</title>
</head>
<body>
<h1>${headering}</h1>
	<h2>${description}</h2>
<h3>${message}</h3>
USER NAME: ${user.name }<br>
EMAIL: ${user.email }<br>
PASSWORD: ${user.password }<br>
</body>
</html>