<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
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
						style="margin-left: 5px;">CURSOS</strong>
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
					<th>Nombre</th>
					<th>IdDocente</th>
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
					<h4 class="modal-title" id="myModalLabel">Registrar Curso</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="first_name">Nombre:</label> <input type="text"
							id="nombre" placeholder="Curso..." class="form-control" />
					</div>
					<div class="form-group">
						<label for="first_name">IdDocente:</label> <input type="number"
							id="iddocente" placeholder="0..." class="form-control" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
					<button type="button" class="btn btn-primary" id="guardar1"
						name="guardar1" data-dismiss="modal">
						<i class="fa fa-floppy-o" aria-hidden="true"></i>
					</button>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="update_curso_modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modificar Curso</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="first_name">Nombre:</label> <input type="text"
							id="nombre-edit" placeholder="Curso..." class="form-control" />
					</div>
					<div class="form-group">
						<label for="first_name">IdDocente:</label> <input type="number"
							id="iddocente-edit" placeholder="0" class="form-control" />
						<input type="hidden" id="curso-edit-id">
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
					<button type="button" class="btn btn-primary"
						onclick="actualizarCurso()" data-dismiss="modal">
						<i class="fa fa-floppy-o" aria-hidden="true"></i>
					</button>
				</div>
			</div>
		</div>
	</div>
	<script src="<c:url value="resources/js/jquery-3.1.1.min.js"/>"></script>
	<script src="<c:url value="resources/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="resources/js/bootbox.min.js"/>"></script>
	<script src="<c:url value="resources/js/prueba1.js"/>"></script>

</body>
</html>