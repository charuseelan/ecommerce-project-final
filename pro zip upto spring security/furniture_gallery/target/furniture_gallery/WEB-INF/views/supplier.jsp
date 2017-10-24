<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Page</title>
</head>
<body>
<form:form action="supplier" method="post" commandName="supplier">
<label><b>id</b></label>
    <form:input type="text" path="id" class="form-control" placeholder="supplier id"/><br>
    <br><label><b>Name</b></label>
    <form:input type="text" path="name" class="form-control" placeholder="supplier name"/><br>
    <input type="button" value="submit"/>
</form:form>
</body>
</html>