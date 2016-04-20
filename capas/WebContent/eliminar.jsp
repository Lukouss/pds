<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="menu.jsp"/>
<title>Insert title here</title>
</head>
<body>
<h2>eliminar contacto</h2>
	<form action="Servletborrar" method="DELETE">

		Nombre
		<input type="text" name="nombre" required>
		<br>
		
		apellido
		<input type="text" name="apellido" required>
		<br>
		
		<input type="submit" value="enviar" >
		</form>
</body>
</html>