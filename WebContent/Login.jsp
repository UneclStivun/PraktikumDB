<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login-Formular</title>
	<link href="LoginStyle.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="header">Loginformular</div>
<div class="navbar">
		<a href="index.jsp">Wilkommensseite</a>
		<a href="Registrierung.jsp">Registrierung</a>
		<a href="Impressum.jsp">Impressum</a>
		<a href="Kontakt.jsp">Kontakt</a>
		<a class="right">Logout</a>
	</div>
<form method="post" action="LoginServlet">

  <div class="container">
  <ul>
  <li>
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>
  </li>
  <li>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
  </li>
  <li>
    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </li>
  </ul>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</body>
</html>