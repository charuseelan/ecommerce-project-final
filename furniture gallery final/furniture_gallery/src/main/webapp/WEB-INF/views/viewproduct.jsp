<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="CommonHeader.jsp" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image:url('https://ih0.redbubble.net/image.72671857.9110/flat,800x800,070,f.u3.jpg');
}
h2{
color:white;
text-align:center;
}



</style>
</head>
<body>
<h2>Product details</h2>
<c:url value="/resources/images/${product.id }.png" var="imageurl"></c:url>
<img src="${imageurl }" height="70" width="70">
<table align="center">
<tr>
<td>
<h4>Product name:</h4></td><td>${product.name }</td>
</tr>
<tr>
<td><h4>price:</h4></td><td>${product.prize }</td></tr>
<tr>
<td><h4>Description:</h4></td><td>${product.descrption }</td></tr>
<tr>
<td><h4>Quantity:</h4></td><td>${product.quantity }</td></tr>

</table>
<c:if  test="${product.quantity==0 }">
Out Of Stock
</c:if>

<c:if test="${product.quantity!=0 }">
<c:url value="/cart/addtocart/${product.id }" var="load"></c:url>
<form action="${load}">
<br><br>

<h4>Enter Units<input  type="text" name="units"></h4><br>
<br>

<button type="submit" value="addToCart"
 style="background:none;border:none;padding:0" class="btn btn-default btn-lg">
<span  class="glyphicon glyphicon-shopping-cart">addToCart</span></button>
<br><br>

</form>
</c:if>
<c:url value="returns" var="url1"></c:url>
<a href="${url1 }"><h4>Back to product list</h4></a><br>

</body>

</html>
<%@ include file="commonfooter.jsp" %>