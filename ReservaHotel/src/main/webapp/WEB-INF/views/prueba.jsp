<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="resources/css/bootstrap.min.css"/>"  rel="stylesheet">
<link href="<c:url value="resources/css/estilos.css"/>"  rel="stylesheet">
</head>
<body>


<div class="container prueba">
	<h1>Ejemplo básico de Spring MVC</h1>
	<hr>
	<div class="form-group">
		<label>Texto</label>
		<input type="text" class="form-control" id="texto">
	</div>
	<div class="form-group">
		<input type="button" class="btn btn-danger" value="Mostrar" id="boton">
	</div>
	
</div>
<div class="container" id="mensaje">

</div>

<script src="<c:url value="resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="resources/js/script2.js"/>"></script>
</body>
</html>