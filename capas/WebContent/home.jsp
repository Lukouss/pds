<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "i" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="menu.jsp"/>
<title>Home</title>
</head>
<body>
	<form action="login" method="post">
	
	Usuario
   	<input type="text" name="user" value="usuario">
   	<br>
   	Contrase�a
  	 <input type="password" name="password" value="contrase�a">
   	<br>
  	 <input type="submit" value="Enviar">
  	<br>
	</form>

</body>
</html>