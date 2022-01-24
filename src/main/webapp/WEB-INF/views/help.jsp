<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello this is help Page
<%
String name=(String)request.getAttribute("name");
out.println(name);
int rollno=(Integer)request.getAttribute("rollno");
out.println(rollno);
String branch=(String)request.getAttribute("branch");
out.println(branch);

%>
</body>
</html>