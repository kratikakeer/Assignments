<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./register" method="post">
        <label>UserName</label>
        <input type="text" name="name"><br><br>
        <label>Email</label>
        <input type="email" name="email"><br><br>
        <label>PhoneNo</label>
        <input type="number" name="phoneNo"><br><br>
        <label>Address</label>
        <input type="text" name="address"><br><br>
        <input type= "submit" value="Register">
      </form>

</body>
</html>