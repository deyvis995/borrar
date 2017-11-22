<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>docente</title>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="<c:url value="resources/css/bootstrap.min.css"/>"  rel="stylesheet">
<link href="<c:url value="resources/css/estilos.css"/>"  rel="stylesheet">
</head>
<body>
   <div class="container prueba">
   		<div class="form-group">
   			<label>Nombres:</label>
   			<input type="text" class="form-control" name="nombres">
   		</div>
   		<div class="form-group">
   			<label>Apellidos:</label>
   			<input type="text" class="form-control" name="nombres">
   		</div>
   		<div class="form-group">
   			<input type="button" class="btn btn-primary" name="boton" value="Enviar">
   		</div>
   
   </div>
</body>
</html>