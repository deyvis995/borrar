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
	<table class="table">
  <thead>
    <tr>
      <th>#</th>
      <th>NOMBRES</th>
      <th>APELLIDOS</th>
      <th colspan="2">OPERACIONES</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${lst}" var="docente">
  	<tr>
      <th scope="row">1</th>
      <td>${docente.nombres}</td>
      <td>${docente.apellidos}</td>
      <td><a href="/editContact?id=${docente.iddocente}" class="btn btn-warning"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
      <td><a href="deleteDocente?id=${docente.iddocente}" class="btn btn-danger"><i class="fa fa-times" aria-hidden="true"></i></a></td>
    </tr>
  </c:forEach>
    
  </tbody>
</table>
</div>
</body>
</html>