$(document).ready(function (){
	//listar();
	alert("ssdsdd");
})
/*
function listar(){
    $.get("hc",{opc:1},function (data, status){
        var alum = JSON.parse(data); 
        $("#tablita").find("tr:gt(0)").remove();
        $.each(alum, function (index, obj){
            $("#tablita tr:last").after("<tr><td>"+obj.id+"</td><td>"+obj.nombre+"</td><td>"+obj.apellido+"</td><td>"+obj.sexo+"</td><td>"+obj.fechaNacimiento+"</td><td>"+obj.fechaRegistro+"</td><td>"+obj.correo+"</td><td><button type='button' class='btn btn-warning' onclick='modificar("+obj.id+")'>"+
             "<i class='fa fa-pencil' aria-hidden='true'></i></button></td><td><button type='button' class='btn btn-danger' onclick='eliminar("+obj.id+")'><i class='fa fa-trash' aria-hidden='true'></i></a></td></tr>");
        });
    });
}
function listar2(){
    $.get("hc",{opc:6},function (data, status){
        var alum = JSON.parse(data); 
        $("#tablita").find("tr:gt(0)").remove();
        $.each(alum, function (index, obj){
            $("#tablita tr:last").after("<tr><td>"+obj.idproducto+"</td><td>"+obj.nombre+"</td><td>"+obj.precio+"</td><td><button type='button' class='btn btn-warning' onclick='modificar("+obj.idalum+")'>"+
             "<i class='fa fa-pencil' aria-hidden='true'></i></button></td><td><button type='button' class='btn btn-danger' onclick='eliminar("+obj.idalum+")'><i class='fa fa-trash' aria-hidden='true'></i></a></td></tr>");
        });
    });
}
//registrar Alumno en la BD
$("#guardar").click(function(){
	alert("sfdfd");
	var nombres = $("#nombres").val();
	var apellidos = $("#apellidos").val(); 
	
	$.post("nuevoDocente",{nombres:nombres,apellidos:apellidos},function (data) {
         if(data==1){
        	 bootbox.alert({ 
        		  size: "small",
        		  title: "REGISTRAR",
        		  message: "Alumno guardado correctamente", 
        		  callback: function(){
        			  //listar();
                      $("#add_new_record_modal").modal("hide");
                      limpiar();   
        		  }
        		})                          
         }
     });
});

//Cargar Elementos en el formulario para modificar 
function modificar(id){
	$("#alumno-edit-id").val(id);
    $.post("hc", {
            id: id,
            opc: 3
        },  function (data, status) {            
            var rol = JSON.parse(data);
            $("#alumno-edit").val(rol.nombre);
            $("#telefono-edit").val(rol.telefono);
        }
    );
    $("#update_alumno_modal").modal("show");
}
function eraser(){
	$("#alumno-edit").val("");
    $("#telefono-edit").val("");
}
//actualizar alumno en la BD
function actualizar(){
	var nombre = $("#alumno-edit").val();
    var telefono = $("#telefono-edit").val();
    var id = $("#alumno-edit-id").val();
    $.post("hc", {
            id: id,
            nombre: nombre,
            telefono:telefono,
            opc: 4
        },
        function (data, status) {
            listar();
            $("#update_alumno_modal").modal("hide");
            limpiar();
        }
    );
}
//Eliminar Alumno de la BD
function eliminar(id){
	bootbox.confirm({ 
		  size: "small",
		  message: "Desea eliminar?", 
		  callback: function(result){ 
			  if(result == true){
				  $.post("hc", {
			            id: id,
			            opc: 5
			        }, function (data, status) {
			           listar();
			            }
			      );
			  }
		  }
		})

}
//
//Otros
function limpiar(){
    if ($('.modal-backdrop').is(':visible')) {
        $('body').removeClass('modal-open'); 
        $('.modal-backdrop').remove(); 
    };
}
*/