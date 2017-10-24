<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,height=device-height,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

<title>supplierpage</title>
<style type="text/css">
body {
	background-image: url("images/reg.jpg/ ");
	background-size:300%;
	background-repeat:no-repeat;
}

</style>

</head>
<body>

<center><h1>furnitureZone</h1></center>
<nav class="navbar navbar-inverse ">
  <div class="container-fluid">
    <div class="navbar-header">
    <a href="index" class="pull-left"></a>
     <div class="navbar-brand">furnitureZone</div>
    </div>
    
    
    <ul class="nav navbar-nav">
      <li ><a href="index.jsp">Home</a></li>
      <li ><a href="Category">Manage category</a></li>      
      <li><a href="Product">Manage product</a></li> 
      <li class="active"><a href="Supplier">Manage supplier</a></li> 
    </ul>

  </div>
</nav>
<center>
<form:form action="SaveSupplier" method="post" commandName="supplier" style="width:30%;">

    <form:input type="hidden" path="supplierid" class="form-control" placeholder="supplier id"/><br>
    <br><label><b>Name</b></label>
    <form:input type="text" path="suppliername" class="form-control" placeholder="supplier name"/><br>
     <br><label><b>description</b></label>
    <form:input type="text" path="supplieraddress" class="form-control" placeholder="supplier description"/><br>
      <td><input type="submit" value="submit">
</form:form>

<table style="width:70%" border="1">
            <tr>
                <th>SUPPLIER id</th>
                <th>SUPPLIER name</th>
                <th>SUPPLIER ADDRESS</th>
                <th>delete</th>
                <th>Edit</th>
            </tr>

            <c:forEach items="${suplist}" var="supplier">
                <tr>
                    <td>${supplier.supplierid}</td>
                    <td>${supplier.suppliername}</td>
                    <td>${supplier.supplieraddress}</td>
                    <td><a href="supplierdelete?sid=${supplier.supplierid}">delete</a></td>
                    <td><a href="supplieredit?sid=${supplier.supplierid}">Edit</a></td> 
				</tr>
			</c:forEach>
</table>		


</center>
</body>
</html>