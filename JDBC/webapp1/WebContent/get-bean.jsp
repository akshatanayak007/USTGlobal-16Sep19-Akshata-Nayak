<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<jsp:useBean id="obj" class="com.ust.webapp1.servlets.Employee" scope="request"/>

<body>
<h2><%=obj.getId() %></h2>
<h2><%=obj.getName() %></h2>
</body>
</html>