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
			<li><a href="perform_logout"><span
						class="glyphicon glyphicon-log-out"></span>logout</a></li>
			
		</ul>

	</div>
	</nav>


	
		<form:form action="saveProduct" commandName="product" method="post"
			enctype="multipart/form-data">
			<table style="width: 50%" align="center">
	

                <tr>
					<td><form:input type="hidden" path="id" /></td></tr> 
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
				<td><form:select name="CustomerId" path="catid">
						<option value="-1" selected>select..</option>
						<c:forEach var="category" items="${catlist}">
							<option value="${category.catid}">${category.catname}</option>
						</c:forEach>
         </form:select></td>
				<th>Supplier</th>
				<td><form:select path="Supplierid">
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



<div class="container">


<table style="width:70%;text-color:white;" border="1">
            <tr>
               <th>product image</th>
                <th>product id</th>
                <th> PRODUCT NAME</th>
            <!--     <th>CATEGORY</th>    -->
                <th> PRODUCT PRICE</th>
                <th> PRODUCT QUANTITY</th>
                <th>PRODUCT  DESCRIPTION</th>
                <th>delete</th>
                <th>Edit</th>
            </tr>

            <c:forEach items="${prolist}" var="product">
            <c:url value="/viewproduct/${product.id}" var="viewUrl"></c:url>
            <c:url value="/resources/${product.id}.jpg" var="imageUrl"></c:url>
                <tr>
                <td><img src="${imageUrl }" height="50" width="50"></td>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
             <!--       <td>${product.category.catname }</td>     -->
                    <td>${product.prize}</td>
                    <td>${product.quantity}</td>
                    <td>${product.descrption}</td>
                     <security:authorize access="hasRole('ROLE_ADMIN')">
                   
                    <td><a href="prodelete?pid=${product.id}">delete</a></td>
                    <td><a href="proedit?pid=${product.id}">Edit</a></td> 
                    </security:authorize>
				</tr>
			</c:forEach>
</table>

</div>
	
</body>
</html>
