<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h1>Registration:</h1>
	<form action="register" method="post">
	<input type = "hidden" id = "status" value ="<%= request.getAttribute("status") %>" />
		<table>
			<tr>
				<td>First Name :</td>
				<td><input type="text" name="firstName" required/></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lastName" required/></td>
			</tr>
			<tr>
				<td>Username :</td>
				<td><input type="text" name="userName" required/></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" id="password" required/></td>
			</tr>
			<tr>
				<td>Confirm Password :</td>
				<td><input type="password" name="confirmPassword" id ="confirmPassword" required/></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address" required /></td>
			</tr>
			<tr>
				<td>Contact :</td>
				<td><input type="text" name="contact" required /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /><br>
				<br></td>
				<td><a href="login.jsp">Already an User?Login?</a></td>
			</tr>

		</table>
	</form>
	
	<script>
	    var password = document.getElementById("password")
	    var confirmPassword = document.getElementById("password")
	    if(password != confirmPassword}){
	    	alert("passwords dont match")
	    }
		var status = document.getElementById("status").value;
		if(status != "success"){
			alert("Error Registering");
		}
	</script>
</body>
</html>


