$(document).ready(function (){
	listar();
})

//Listar Docente
function listar(){
    $.get("getCursos",function (data, status){
    $("#tablita").find("tr:gt(0)").remove();
    for(var i in data){
        $("#tablita tr:last").after("<tr><td>"+data[i].idcurso+"</td><td>"+data[i].nombre+"</td><td>"+data[i].iddocente+"</td><td><button type='button' class='btn btn-warning' onclick='modificarCurso("+data[i].idcurso+")'>"+
        "<i class='fa fa-pencil' aria-hidden='true'></i></button></td><td><button type='button' class='btn btn-danger' onclick='eliminarCurso("+data[i].idcurso+")'><i class='fa fa-trash' aria-hidden='true'></i></a></td></tr>");
       }
        
    });
}

//registrar Docente en la BD
$("#guardar1").click(function(){
	//alert("sfdfd");
	var nombre = $("#nombre").val();
	var iddocente = $("#iddocente").val(); 
	$.post("guardarCurso",{nombre:nombre,iddocente:iddocente},function (data) {
         if(data=='1'){
        	 bootbox.alert({ 
        		  size: "small",
        		  title: "REGISTRAR",
        		  message: "Curso guardado correctamente", 
        		  callback: function(){
        			  listar();
                      $("#add_new_record_modal").modal("hide");
                      limpiar();   
        		  }
        		});                          
         }
     });
});

//Buscar curso
function modificarCurso(id){
	$("#curso-edit-id").val(id);
	//alert(id);
    $.post("buscarCurso", {
            id: id
        },  function (data, status) {
        	//alert(data.nombre);
        	console.log(data);
          $("#nombre-edit").val(data.nombre);
          $("#iddocente-edit").val(data.iddocente);
        }
    );
    $("#update_curso_modal").modal("show");
}
function eraser(){
	$("#alumno-edit").val("");
    $("#telefono-edit").val("");
}

//actualizar Docente en la BD
function actualizarCurso(){
	var nombre = $("#nombre-edit").val();
    var iddocente = $("#iddocente-edit").val();
    var id = $("#curso-edit-id").val();
    console.log(nombre+"/"+iddocente+"/"+id);
  //  
    bootbox.confirm({ 
		  size: "small",
		  message: "Desea modificar Curso?", 
		  callback: function(result){ 
			  if(result == true){
				  $.post("actualizarCurso", {
                      id: id,
                      nombre: nombre,
                      iddocente:iddocente
                  }, function (data, status) {
                      listar();
                      $("#update_curso_modal").modal("hide");
                      limpiar();
                  });
			  }
		  }
    });
  //
}
//Eliminar Docente de la BD
function eliminarCurso(id){
	bootbox.confirm({ 
		  size: "small",
		  message: "Desea eliminar Curso?", 
		  callback: function(result){ 
			  if(result == true){				  
				  $.post("eliminarCurso", {
			            id: id
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