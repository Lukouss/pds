<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="menu.jsp"/>
    <script type="text/javascript" src="./js/validaciones.js"></script>
<title>Eliminar</title>
</head>
<body>
<h2>eliminar contacto</h2>
	<form action="Borrar" id="Borrar" method="DELETE" class="form-horizontal mitad" >

		<div class="form-group">
		<label class="col-lg-3 control-label">Rut</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" name="rut" required>
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