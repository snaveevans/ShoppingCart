<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="co.tylerevans.Product" %>
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
			Below is a list of available products: <br />
		</h2>
			<%
			List<Product> products = (List<Product>)request.getAttribute("products");
		
			for(Product product : products)
			{
				%>
					<a href="
						<c:url value="/Cart">
							<c:param name="action" value="addToCart" />
							<c:param name="productID" value="<%= Integer.toString(product.getId()) %>"/>
						</c:url>">
						<%= product.getName() %>
					</a>
					<br />
				<%
			}
			%>
		
	</div>
</body>
</html>