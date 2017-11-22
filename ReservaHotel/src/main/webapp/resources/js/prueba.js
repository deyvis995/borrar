$(document).ready(function (){
	listar();
})

//Listar Docente
function listar(){
    $.get("get",function (data, status){
    $("#tablita").find("tr:gt(0)").remove();
    for(var i in data){
        $("#tablita tr:last").after("<tr><td>"+data[i].iddocente+"</td><td>"+data[i].nombres+"</td><td>"+data[i].apellidos+"</td><td><button type='button' class='btn btn-warning' onclick='modificarDocente("+data[i].iddocente+")'>"+
        "<i class='fa fa-pencil' aria-hidden='true'></i></button></td><td><button type='button' class='btn btn-danger' onclick='eliminarDocente("+data[i].iddocente+")'><i class='fa fa-trash' aria-hidden='true'></i></a></td></tr>");
       }
        
    });
}

//registrar Docente en la BD
$("#guardar").click(function(){
	//alert("sfdfd");
	var nombres = $("#nombres").val();
	var apellidos = $("#apellidos").val(); 
	
	$.post("guardarDocente",{nombres:nombres,apellidos:apellidos},function (data) {
         if(data=='1'){
        	 bootbox.alert({ 
        		  size: "small",
        		  title: "REGISTRAR",
        		  message: "Docente guardado correctamente", 
        		  callback: function(){
        			  listar();
                      $("#add_new_record_modal").modal("hide");
                      limpiar();   
        		  }
        		});                          
         }
     });
});

//Buscar Docente
function modificarDocente(id){
	$("#docente-edit-id").val(id);
    $.post("buscarDocente", {
            id: id
        },  function (data, status) {      
        	console.log(data);
          $("#nombres-edit").val(data.nombres);
          $("#apellidos-edit").val(data.apellidos);
        }
    );
    $("#update_docente_modal").modal("show");
}
function eraser(){
	$("#alumno-edit").val("");
    $("#telefono-edit").val("");
}

//actualizar Docente en la BD
function actualizarDocente(){
	var nombres = $("#nombres-edit").val();
    var apellidos = $("#apellidos-edit").val();
    var id = $("#docente-edit-id").val();
    console.log(nombres+"/"+apellidos+"/"+id);
  //  
    bootbox.confirm({ 
		  size: "small",
		  message: "Desea modificar Docente?", 
		  callback: function(result){ 
			  if(result == true){
				  $.post("actualizarDocente", {
                      id: id,
                      nombres: nombres,
                      apellidos:apellidos
                  }, function (data, status) {
                      listar();
                      $("#update_docente_modal").modal("hide");
                      limpiar();
                  });
			  }
		  }
    });
  //
}
//Eliminar Docente de la BD
function eliminarDocente(id){
	bootbox.confirm({ 
		  size: "small",
		  message: "Desea eliminar Docente?", 
		  callback: function(result){ 
			  if(result == true){				  
				  $.post("eliminarDocente", {
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
