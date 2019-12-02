<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
	<a href="./logout" style="float:left">Logout</a>
<fieldset>
		<legend>Change Password</legend>
		<form action="./changepassword" method="post" style="margin-left:300px">
			<table>
				<tr>
				<td>Old Password:</td><td><input type = "password" name="password"></td>
				</tr>
				<tr>
				<td>New Password:</td><td><input type = "password" name="newpassword"></td>
				</tr>
				<tr>
				<td><input type = "reset" value="Reset"></td>
				<td><input type="submit" value="Change"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>