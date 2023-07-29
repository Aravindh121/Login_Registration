<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>First Name</td>
			<td><c:out value = "${employee.firstname}" /></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><c:out value = "${employee.lastname}" /></td>
		</tr>
		<tr>
			<td>Username</td>
			<td><c:out value = "${employee.username}" /></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><c:out value = "${employee.address}" /></td>
		</tr>
		<tr>
			<td>Contact</td>
			<td><c:out value = "${employee.contact}" /></td>
		</tr>
		<tr>
			<td><a href="home.jsp">Home</a></td>
			<td><a href="edit?id=${employee.id}">Edit</a></td>
		</tr>
	</table>
</body>
</html>