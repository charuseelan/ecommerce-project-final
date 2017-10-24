

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-image:
		url('https://www.google.co.in/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwi5s5KZ_-fWAhUJQI8KHSAEBW0QjRwIBw&url=https%3A%2F%2Fwww.pinterest.co.uk%2Fpin%2F345932815113388674%2F&psig=AOvVaw3haZg18W14GLNwHHAef88F&ust=1507791471459812');
}

h3 {
	text-align: center;
	color: white;
}

table {
	opacity: 0.9;
}
</style>
<script>
	$(document).ready(function() {
		var searchCondition = '${searchCondition}';
		$('.table').DataTable({
			"lengthMenu" : [ [ 3, 5, 7, -1 ], [ 3, 5, 7, "All" ] ],
			"oSearch" : {
				"sSearch" : searchCondition
			}
		})
	});
</script>
</head>
<body>
	<h3>
		<b>List of products</b>
	</h3>
	<div class="container">
		</thead>


		<table style="width: 70%; text-color: white;" border="1">
			<tr>
				<th>product images</th>
				<th>product id</th>
				<th>PRODUCT NAME</th>
				<th>PRODUCT PRICE</th>
				<th>PRODUCT QUANTITY</th>
				<th>PRODUCT DESCRIPTION</th>
				<th>delete</th>
				<th>Edit</th>
			</tr>

			<c:forEach items="${prolist}" var="product">
				<c:url value="/resources/${product.id }.png" var="imageurl"></c:url>
				<tr>
					<td><img src="${imageurl }" height="50" width="50"></td>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.prize}</td>
					<td>${product.quantity}</td>
					<td>${product.descrption}</td>

					<td><a href="prodelete?pid=${product.id}">delete</a></td>
					<td><a href="proedit?pid=${product.id}">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>

