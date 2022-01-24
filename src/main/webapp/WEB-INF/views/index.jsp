<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
HELLO THIS IS INDEX PAGE CALLED BY HOME CONTROLLER

<%
String name=(String)request.getAttribute("name");
int id=(Integer)request.getAttribute("id");
List<String> friends=(List<String>)request.getAttribute("f");

%>
<h1>Name is <%=name%></h1>
<h1>Id is <%=id%></h1>
<%
for(String i:friends)
{
	%>
<h1><%=i%></h1>	
	<%} %>

</body>
</html>