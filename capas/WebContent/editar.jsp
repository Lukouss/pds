<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<jsp:include page="menu.jsp"/>
     
    <script type="text/javascript" src="validador.js"></script>
    
<title>Insert title here</title>
</head>
<body>
<h2>editar contacto</h2>
	<form action="Servletmodificar" id = "Servletmodificar" method="put">

		Nombre
		<input type="text" name="nombre" required>
		<br>
		Apellido
		<input type="text" name="apellido" required>>
		<br>
		Mail
		<input type="text" name="mail" required>>
		<br>
		Telefono
		<input type="text" name="telefono" required>>
		<br>		
		<input type="submit" value="enviar">
	</form>

</body>
</html>