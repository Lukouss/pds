<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="menu.jsp"/>
    <script type="text/javascript" src="./js/validaciones.js"></script>
<title>Editar</title>
</head>
<body>
<h2>editar usuario</h2>
	<form action="ModificarUsuario" id ="ModificarUsuario" method="Put" class="form-horizontal mitad" >

	<div class="form-group">
		<label class="col-lg-3 control-label">Nickname</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" placeholder="Ingrese un nickname" name="nickname" required>
			<br>
		</div>
	</div>	
	<div class="form-group">
		<label class="col-lg-3 control-label">password</label>
		<div class="col-lg-3">
			<input type="password" class="form-control" placeholder="Ingrese un password" name="password" required>
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