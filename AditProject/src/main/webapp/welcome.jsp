<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
Welcome to Our Application

</h1>
<% if(session.getAttribute("user")==null) 
response.sendRedirect("login.jsp");%>
<span>${user}</span>



<form action="login.jsp">
<input type="submit" value="logout"/>
</form>
</body>
</html>