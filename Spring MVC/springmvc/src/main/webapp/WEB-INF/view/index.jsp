
<%
	String s = (String)request.getAttribute("msg");
%>


<html>
<body>
<h2>${msg}</h2>
<h2 style="color:red"><%=s%></h2>
<h2 style="color:purple">${name}</h2>
<h2 style="color:yellow">${id}</h2>
</body>
</html>
