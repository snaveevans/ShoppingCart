<%@ page import="co.tylerevans.User" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%@include file="_header.jsp"%>

	<div>
		<h2>
			Welcome ${user.name }</h2>
		<form action="home" method="post">
			<p>
				Name: <input type="text" name="name" />
			</p>
			<p>
				<input type="submit" value="Enter Name" />
			</p>
		</form>
	</div>
</body>
</html>