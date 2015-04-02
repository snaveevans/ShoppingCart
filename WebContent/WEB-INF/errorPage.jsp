<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
	<title>Error Page</title>
</head>
<%@include file="_header.jsp" %>
<body>
<h1>Error Page</h1>
<%= exception.getMessage() %>
</body>
</html>