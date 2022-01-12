<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int n1, n2; %>
<%! double result; %>



<%
        
int n1 = Integer.parseInt(request.getParameter("firstno"));
int n2 = Integer.parseInt(request.getParameter("secondno"));
		
		
		
		if("addition".equals(request.getParameter("add"))){
		    result=n1+n2;
		}
		 else if("subtraction".equals(request.getParameter("sub"))) {
		    result=n1-n2;
		   
		}
		else if("multiply".equals(request.getParameter("mul"))) {
		    result=n1*n2;
		}
		else if("divide".equals(request.getParameter("div"))) {
			result=n1/n2;
		}
		else if("modulous".equals(request.getParameter("mod"))) {
			result=n1%n2;
		}
		
%>
<h1>Result<%= result %></h1>

</body>
</html>