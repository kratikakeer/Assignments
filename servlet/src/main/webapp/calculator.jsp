<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./calci.jsp">
     <label>FirstNumber</label>
     <input type="number" placeholder="FirstNumber" name="firstno"><br><br>
     <label>SecondNumber</label>
     <input type="number" placeholder="SecondNumber" name="secondno"><br><br>
     <input type="submit" value="addition" name="add">
     <input type="submit" value="subtraction" name="sub">
     <input type="submit" value="multiply" name="mul">
     <input type="submit" value="divide" name="div">
     <input type="submit" value="modulous" name="mod"><br><br> 
     
</form>
</body>
</html>