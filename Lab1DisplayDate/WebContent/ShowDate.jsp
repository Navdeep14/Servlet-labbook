<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Date</title>
</head>
<body>
	<a href="Date">Show Date</a>
	<button onclick="window.location.href='Date'">Show Date</button>
	<br>
	<% if (request.getParameter("dt") != null) { %>
	<h4 style="color: teal">Today is
	<%=request.getParameter("dt")%></h4>
	<% } %>
</body>
</html>