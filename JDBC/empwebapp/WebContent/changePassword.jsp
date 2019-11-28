<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.td{
margin-bottom:left;
}
</style>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
</head>
<body>
	<form action = "./changepassword" style="width:340px; height:200px; background-color:gray" method="post">
		<table style="align:center">
		<tr>
		<td><a href="./home">Home</a></td>
		<td style="color:red ; text-align:right"><a href="./logout"style="color:red" >Logout</a></td>
		</tr>
		<h2><%=msg %></h2>
			<tr>
			<td>New Password</td>
			<td><input type ="password" name="new"></td>
			</tr>
			<tr >
			<td style="margin-top:25px">Confirm Password</td>
			<td ><input type ="password" name="confirmpass" style="margin-top:20px"></td>
			</tr>
			<tr>
			<td></td>
			<td><input  style =" margin-top:20px; margin-right:40px"type="reset" value="Reset">
			<input  style =" margin-top:20px"type="submit" value="Submit"></td>
			</tr>
			
		
		</table>
	</form>
	
</body>
</html>