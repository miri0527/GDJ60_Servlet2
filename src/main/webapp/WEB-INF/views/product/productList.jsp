<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.iu.home.product.ProductDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List Page</h1>

	<%
		List<ProductDTO> ar = (List<ProductDTO>) request.getAttribute("list");
	
		for(ProductDTO productDTO: ar) {
				
	%>
	<h3><%=productDTO.getProduct_num() %></h3>
	<h3><a href= "./detail.do?productNum=<%=productDTO.getProduct_num() %>"><%=productDTO.getProduct_name() %></a></h3>
	<%} %>	
	
</body>
</html>