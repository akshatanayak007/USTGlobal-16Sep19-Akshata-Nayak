<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@page import="com.ustglobal.empwebapp.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");
%>
<body>
<a href='./home'>Home</a>
<a style = 'float:right' href='./logout'>Logout</a>");
<% if(info != null) {%>

<table align ='center'>
<tr>
<th>Id</th><th>Name</th><th>Email</th>
</tr>
<tr>
<td><%= info.getId()%></td>
<td><%=info.getName() %></td>
<td><%=info.getEmail()%></td>
	
</tr>
</table>
<% }else{%>

<h1 style="color:red">No Data Found</h1>
<%} %>
</body>
</html>