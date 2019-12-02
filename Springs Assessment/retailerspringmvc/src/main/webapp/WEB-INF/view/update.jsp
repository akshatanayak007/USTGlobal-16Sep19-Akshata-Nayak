<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
	<legend>Update Profile</legend>
	<form action="./update" method="post" style="margin-left:300px">
		<table>
			<tr>
			<td>Name:</td><td><input type="text" name="name"></td>
			</tr>
			<tr>
			<td>Email:</td><td><input type="email" name="email"></td>
			</tr>
			<tr>
			<td>Date of Joining:</td><td><input type="date" name="doj"></td>
			</tr>
			<tr>
			<td>Gender:</td>
			<td><select name="gender" required="required">
				<option>----Select----</option>
				<option value="M">Male</option>
				<option value="F">Female</option>  
				</select>
			</td>
			</tr>
			<tr>
			<td><input type="reset" value="Reset"></td>
			<td><input type="submit" value="Update"></td> 
			</tr>
		</table>
	
	</form>
	<a href="./login">Login Here</a>
	</fieldset>
</body>
</html>