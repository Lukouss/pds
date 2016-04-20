<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "i" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<jsp:include page="menu.jsp"/>
     
    <script type="text/javascript" src="validador.js"></script>
<title>Ingresar</title>
</head>
<body>
<h2>ingresar Contacto</h2>
	<form action="Ingresar1" id="Ingresar1" method="post" class="form-horizontal mitad" action="#">

		<div class="form-group">
		<label class="col-lg-3 control-label">Nombre</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" name="nombre" required>
			<br>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-lg-3 control-label">Apellido</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" name="apellido" required>
			<br>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-lg-3 control-label">Mail</label>
		<div class="col-lg-3">
			<input type="email" class="form-control" name="mail" required>
			<br>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-lg-3 control-label">Telefono</label>
		<div class="col-lg-3">
			<input type="number" class="form-control" name="telefono" required>
			<br>
		</div>
	</div>	
		<div class="form-group">
		<div class="col-lg-9 col-lg-offset-3">
			<button type="submit" class="btn btn-success left">Enviar</button>
		</div>
	</div>
	</form>

</body>
</html>