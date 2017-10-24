<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport"
	content="width=device-width,height=device-height,initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

<title>product</title>
<style type="text/css">
body {
	background-image: url("resources/reg.jpg/ ");
	background-size: 300%;
	background-repeat: no-repeat;
}
</style>

</head>
<body>
	<center>
		<h1>furnitureZone</h1>
	</center>
	<nav class="navbar navbar-inverse ">
	<div class="container-fluid">
		<div class="navbar-header">
			<a href="index" class="pull-left"></a>
			<div class="navbar-brand">furnitureZone</div>
		</div>


		<ul class="nav navbar-nav">
			<li><a href="index.jsp">Home</a></li>
			<li><a href="Category">Manage category</a></li>
			<li class="active"><a href="Product">Manage product</a></li>
			<li><a href="Supplier">Manage supplier</a></li>
		</ul>

	</div>
	</nav>


	
		<form:form action="saveProduct" modelAttribute="product" method="post"
			enctype="multipart/form-data">
			<table style="width: 50%" align="center">
				<tr>


					<td><form:input type="hidden" path="id" /></td>
				<tr>
					<th>product name</th>
					<td><form:input type="text" path="name" /></td>
				</tr>
				<tr>
					<th>product prize</th>
					<td><form:input type="text" path="prize" /></td>
				</tr>
				<tr>
					<th>quantity</th>
					<td><form:input type="text" path="quantity" /></td>
				</tr>
				<tr>
					<th>descrption</th>
					<td><form:input type="text" path="descrption" /></td>
				</tr>
				<th>Category Name</th>
				<td><form:select name="CustomerId" path="CustId">
						<option value="-1" selected>select..</option>
						<c:forEach var="category" items="${catlist}">
							<option value="${category.catid}">${category.catname}</option>
						</c:forEach>
         </form:select></td>
				<th>Supplier</th>
				<td><form:select path="SuppId">
						<option value="-1">select..</option>
						<c:forEach var="sup" items="${suplist}">
							<option value="${sup.supplierid}">${sup.suppliername}</option>
						</c:forEach>
					</form:select></td>
				<tr>
					<td>
						<h3>Upload an image</h3>
						<input type="file" name="pimage">
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>

				</tr>
			</table>
		</form:form></div>



	
</body>
</html>