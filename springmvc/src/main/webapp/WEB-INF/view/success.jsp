<%@page import="com.te.springmvc.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Register ref =(Register) request.getAttribute("details"); %>
<h1 style="color: red"><%= ref.getName() %> Registered Successfully!! </h1>
<h1> <%= ref %> </h1>

</body>
</html>