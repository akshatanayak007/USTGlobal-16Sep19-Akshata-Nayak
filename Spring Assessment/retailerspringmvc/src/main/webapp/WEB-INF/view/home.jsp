<%@page import="com.ustglobal.retailerspringmvc.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./update">Update</a>
	<a href="./delete">delete</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>
		Welcome
		<%=bean.getName()%></h2>
	<fieldset>
		<legend>Search employee</legend>
		<form action="./search">
			<table>
				<tr>
					<td>Retailer_id:</td>
					<td><input type="number" name="retailer_id"></td>
					<td><input type="submit" name="search"></td>
				</tr>
				</table>
		</form>
	</fieldset>
	<%
	RetailerBean retailerbean=(RetailerBean)request.getAttribute("bean");
	%>
	<%
	if(retailerbean!=null){
		%>
		<table>
		<tr>
		<th>Name</th>
		<th>Email</th>
		<th>password</th>
	</tr>
	<tr>
	<td><%=retailerbean.getName() %></td>
	<td><%=retailerbean.getEmail() %></td>
	<td><%=retailerbean.getPassword()%></td>
	

	</tr>
	</table>
	<%
	}
	%>
	<h3>${msg}</h3>
</body>
</html>