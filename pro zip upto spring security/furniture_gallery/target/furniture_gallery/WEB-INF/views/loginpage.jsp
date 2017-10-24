<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>loginpage</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<style>
body {
        background-image: url("images/bgtheme.jpg /");
} 
 
</style>
<style type="text/css">
body {
background-color: #f4f4f4;
color: #5a5656;
font-size: 20px;
line-height: 0.8em;
}
a { text-decoration: none; }
h1 { font-size: 1em; }
h1, p {
margin-bottom: 40px;
color:rgb(0,0,0)
}
strong {
font-weight: bold;
}
.uppercase { text-transform: uppercase; }

/* ---------- LOGIN ---------- */
#login {
margin: 40px auto;
width: 310px;
}
form fieldset input[type="text"], input[type="password"] {
background-color: #e5e5e5;
border: none;
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
color: #5a5656;
font-size: 14px;
height: 40px;
outline: none;
padding: 0px 8px;
width: 280px;
-webkit-appearance:none;
}
form fieldset input[type="submit"] {
background-color: #008dde;
border: none;
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 2px;
color: #f4f4f4;
cursor: pointer;
height: 40px;
text-transform: uppercase;
width: 275px;
-webkit-appearance:none;
}
form fieldset a {
color: #5a5656;
font-size: 15px;
}
form fieldset a:hover { text-decoration: underline; }
.btn-round {
background-color: #5a5656;
border-radius: 50%;
-moz-border-radius: 50%;
-webkit-border-radius: 50%;
color: #f4f4f4;
display: block;
font-size: 12px;
height: 40px;
line-height: 50px;
margin: 30px 100px;
text-align: center;
text-transform: uppercase;
width: 50px;
}
footer
{
background-color:black;
padding: 25px;
}
</style>
</head>
<body>



<nav class="navbar navbar-inverse ">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#" style="color:white;">Furniture Zone</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
         <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Products <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">beds</a></li>
            <li><a href="#">sofas</a></li>
            <li><a href="#">dining tables</a></li>
            <li><a href="#">mattresses</a></li>
          </ul>
        </li>   
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="register"><span class="glyphicon glyphicon-user"></span>Register</a></li>
        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>

<div id="login">
<h2>login</h2>
<form action="login" method="post">   
<fieldset>
<p><input type="text" required value="Username" onBlur="if(this.value=='')this.value='Username'" onFocus="if(this.value=='Username')this.value='' "></p>
<p><input type="password" required value="Password" onBlur="if(this.value=='')this.value='Password'" onFocus="if(this.value=='Password')this.value='' "></p>
<p><a href="#">Forgot Password?</a>          <a href="register">New user?</a></p>
<p><input type="submit" value="Login"></p>
</fieldset>
</form>
 </div>
</nav> 
</body>
<nav class="navbar navbar-inverse navbar-bottom">
<footer class="container-fluid text-center" style="background-color:black; height:30px;"  >
  <p style="color:white ">&copy;furnitureZone</p>  
</footer>

</html>