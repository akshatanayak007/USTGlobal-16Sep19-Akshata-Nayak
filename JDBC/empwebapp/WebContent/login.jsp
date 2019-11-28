<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<%
String id ="";
Cookie[] cookies = request.getCookies();
if(cookies != null) {
for(Cookie cookie : cookies) {
	if(cookie.getName().equals("alwaysRemember")) {
		id=cookie.getValue();
	}
}
}
%>

<body>
<h4><%=msg %></h4>

<fieldset align='center'>
<legend>Login</legend>
<form action = './login' method ='post' style=' content-align:center;width:400px; height:200px;background-color:gray;margin-left:200px'>
<table align='center'>
<tr><td><a href=''>Home</a></td> </tr>
<tr style='margin-top:50px;'><td style='margin-top:50px;'>User ID</td><td><input type ='number' name='id' value='<%=id %>' style='margin-bottom:10px; margin-top:10px;'></td></tr>
<tr><td>Password</td> <td><input type ='password' name='password'></td></tr>
<tr><td><input type ='checkbox' name='remember' value='checked'></td><td>Remeber Me</td></tr>
<tr><td><input  style ='position:float-right'type='submit' name='submit'></td></tr>
<tr><td><a href='register.html'>Register</a></td></tr>
</table>
</form>
</fieldset>
</body>
</html>