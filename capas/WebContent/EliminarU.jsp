<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="menu.jsp"/>
<title>Eliminar</title>
</head>
<body>
<h2>eliminar usuario</h2>
	<form action="BorrarU" id="BorrarU" method="delete" class="form-horizontal mitad" action="#">
<div class="form-group">
		<label class="col-lg-3 control-label">password</label>
		<div class="col-lg-3">
			<input type="password" class="form-control" name="password" required>
			<br>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-lg-3 control-label">Nickname</label>
		<div class="col-lg-3">
			<input type="text" class="form-control" name="nickname" required>
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