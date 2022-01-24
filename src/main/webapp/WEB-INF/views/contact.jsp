<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact(Form)</title>
</head>
<body>
	<h1>${headering}</h1>
	<h2>${description}</h2>
	
	<h3>Registration Form</h3>
     <form action="processform" method="post">
     UserName:<input type="text" name="name" placeholder="Enter name"><br>
     Email:<input type="email" name="email" placeholder="Enter Email"><br>
     Password:<input type="password" name="password" placeholder="Enter Password"><br>
     <input type="submit" value="SignUp">
     </form>
</body>
</html>