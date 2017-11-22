<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<!-- <link -->
<!-- 	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" -->
<!-- 	rel="stylesheet"> -->
<link href="<c:url value="resources/css/bootstrap.min.css"/>"
	rel="stylesheet">
<link href="<c:url value="resources/css/font-awesome.min.css"/>"
	rel="stylesheet">
</head>
<body>
	<div class="container" style="width: 450px;">
		<div class="row">
			<div class="col-md-12">

				<hr>
				<h3>
					<i class="fa fa-address-card-o" aria-hidden="true"></i><strong
						style="margin-left: 5px;">DOCENTES</strong>
				</h3>
				<hr>
				<br>
				<div class="pull-right">
					<button class="btn btn-success" data-toggle="modal"
						data-target="#add_new_record_modal">
						<i class="fa fa-plus" aria-hidden="true"></i>
					</button>
				</div>
			</div>
		</div>
		<table class="table" id="tablita">
			<thead>
				<tr>
					<th>#</th>
					<th>Nombres</th>
					<th>Apellidos</th>
					<th colspan="2">Operaciones</th>
				</tr>
			</thead>

		</table>
	</div>
	<div class="modal fade" id="add_new_record_modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Registrar Docente</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="first_name">Nombres:</label> <input type="text"
							id="nombres" placeholder="Nombres..." class="form-control" />
					</div>
					<div class="form-group">
						<label for="first_name">Apellidos:</label> <input type="text"
							id="apellidos" placeholder="Apellidos..." class="form-control" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
					<button type="button" class="btn btn-primary" id="guardar"
						data-dismiss="modal">
						<i class="fa fa-floppy-o" aria-hidden="true"></i>
					</button>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="update_docente_modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modificar Docente</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="first_name">Nombres:</label> <input type="text"
							id="nombres-edit" placeholder="Nombres..." class="form-control" />
					</div>
					<div class="form-group">
						<label for="first_name">Apellidos:</label> <input type="text"
							id="apellidos-edit" placeholder="Apellidos..."
							class="form-control" /> <input type="hidden"
							id="docente-edit-id">
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
					<button type="button" class="btn btn-primary"
						onclick="actualizarDocente()" data-dismiss="modal">
						<i class="fa fa-floppy-o" aria-hidden="true"></i>
					</button>
				</div>
			</div>
		</div>
	</div>
	<script src="<c:url value="resources/js/jquery-3.1.1.min.js"/>"></script>
	<script src="<c:url value="resources/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="resources/js/bootbox.min.js"/>"></script>
	<script src="<c:url value="resources/js/prueba.js"/>"></script>

</body>
</html>