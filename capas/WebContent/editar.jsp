<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<jsp:include page="menu.jsp"/>
     
    <script type="text/javascript" src="./js/validaciones.js"></script>
    
<title>Editar</title>
</head>
<body>
<h2>editar contacto</h2>
	<form action="Update" id ="Update" method="put" class="form-horizontal mitad" >

<div class="form-group">
		<label class="col-lg-3 control-label">Uid</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" name="uid" value="1" disabled>
			<br>
		</div>
	</div>
		<div class="form-group">
		<label class="col-lg-3 control-label">Nombre</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" name="nombre" placeholder="Ingrese un nombre" required>
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
			<input type="text" class="form-control" name="telefono" required>
			<br>
		</div>
	</div>
	<div class="form-group">
		<label class="col-lg-3 control-label">Cargo</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" name="cargo" required>
			<br>
		</div>
	</div>	
	<div class="form-group">
		<label class="col-lg-3 control-label">Dirrecion</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" name="Dirrecion" required>
			<br>
		</div>
	</div>
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