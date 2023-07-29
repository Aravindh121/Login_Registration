<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
    <h1>Login:</h1>
	<form action = "login" method = "post">
	<input type = "hidden" id = "status" value ="<%= request.getAttribute("status") %>" />
	<table>
		<tr>
			<td>Username :</td>
			<td><input type = "text" name = "username" required/></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><input type = "password" name = "password" required/></td>
		</tr>
		<tr>
			<td><input type = "submit" value ="submit"/><br><br></td>
			<td><a href = "registration.jsp">New User?Register?</a></td>
		</tr>	
	</table>
	</form>
	
	<script>
		var status = document.getElementById("status").value;
		if(status == "failed"){
			alert("Invalid Login Credentials!!!");
		}
	</script>
	
</body>
</html>