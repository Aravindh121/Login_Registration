<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<%
	if (session.getAttribute("start") == null) {
		response.sendRedirect("login.jsp");
	}
	%>
	
	<h1>
		Welcome
		<%=session.getAttribute("firstname")%>
		<%=session.getAttribute("lastname")%></h1>
	<hr>
	<a href="logout">Logout</a>
	<br>
	<a href="profile?id=${sessionScope.id}">Profile</a>
	
</body>
</html>