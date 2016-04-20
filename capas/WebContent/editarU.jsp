<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="menu.jsp"/>
<title>Editar</title>
</head>
<body>
<h2>editar usuario</h2>
	<form action="ModificarUsuario" method="Put">

		Nickname
		<input type="text" name="nickname" required>
		<br>
		password
		<input type="text" name="password" required>
		<br>
		
		<input type="submit" value="enviar">
	</form>
</body>
</html>