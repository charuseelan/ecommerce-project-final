<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>All Users in System</h2>

    <table border="1">
        <tr>
            <th>Username</th>
            <th>Password</th>
            <th>Email</th>
            <th>Phone no</th>
           <th>Delete</th>  
            <th>Edit</th>  
        </tr>
        <c:if test="${!empty userlist}">
            <c:forEach items="${userlist}" var="user">
                <tr>
                    
                    <td>${user.uname}</td>
                    <td>${user.password}</td>
                    <td>${user.email}</td>
                    <td>${user.phno}</td>
                   
                    <td><a href="delete?uid=${user.email}">delete</a></td>
                    <td><a href="edit?uid=${user.email}">edit</a></td>
            </tr>
            </c:forEach>
            </c:if>
    </table>
</body>
</html>



