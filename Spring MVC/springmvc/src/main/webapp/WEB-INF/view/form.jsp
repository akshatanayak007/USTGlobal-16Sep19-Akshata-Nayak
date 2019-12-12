<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./form" method="post" style="margin-left:300px; margin-top:200px">
	<table style="align-content: center">
		<tr>
		<td>Id</td>
		<td><input type="text" placeholder="Enter Id" name="id"></td>
		</tr>
		<tr>
		<td>Name</td>
		<td><input type="text" placeholder="Enter Name" name="name"></td>
		</tr>
		<tr>
		<td>Password</td>
		<td><input type="text" placeholder="Enter Password" name="password"></td>
		</tr>
		<tr>
		<td>Gender</td>
		<td><input type="text" placeholder="Enter Gender" name="gender"></td>
		</tr>
		<tr>
		<td>DOJ</td>
		<td><input type="date" name="doj"></td>
		</tr>
		<tr>
		<td><input type="submit" value="Register"></td>
		<td><input type="reset" value="Reset"></td>
		</tr>
	</table>

</form>

</body>
</html>