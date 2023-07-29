<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
	<table>
		<td><input type ="hidden" name="id" value="${employee.id}"/>
		<tr>
			<td>First Name</td>
			<td><input type ="text" name="firstname" value="${employee.firstname}"/></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type ="text" name="lastname" value="${employee.lastname}" /></td>
		</tr>
		<tr>
			<td>Username</td>
			<td><input type ="text" name="username" value="${employee.username}" /></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><input type ="text" name="address" value="${employee.address}" /></td>
		</tr>
		<tr>
			<td>Contact</td>
			<td><input type ="text" name="contact" value="${employee.contact}" /></td>
		</tr>
		<tr>
			<td><a href="home.jsp">Home</a></td>
			<td><input type ="submit" name="update"/></td>
		</tr>
	</table>
</form>	
</body>
</html>