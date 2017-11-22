package pe.edu.upeu.abcjdbc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import pe.edu.upeu.abcjdbc.entity.Curso;
import pe.edu.upeu.abcjdbc.service.CursoService;

@Controller
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@RequestMapping("/cursos")
	public String cursos() {
		// TODO Auto-generated method stub
		return "cursos";
	}
	
	//Listar Cursos
		@RequestMapping(path = "/getCursos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody String getAllEmployee() {
			Gson g = new Gson();
			return g.toJson(cursoService.readAll());
		}

	//Guardar Cursos
		@RequestMapping(path = "guardarCurso", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody String guardarCurso(HttpServletRequest request) {
			//JOptionPane.showMessageDialog(null, " hola desdes controller");
			String nombre = request.getParameter("nombre");
			int iddocente = Integer.parseInt(request.getParameter("iddocente"));
			//JOptionPane.showMessageDialog(null, nombre+" "+iddocente);
			Curso curso = new Curso(nombre, iddocente);
			Gson g = new Gson();
			return g.toJson(cursoService.create(curso));
		}
	//Eliminar Cursos	
		@RequestMapping(path = "/eliminarCurso", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody String eliminarCurso(HttpServletRequest request) {
	        int id = Integer.parseInt(request.getParameter("id"));
			Gson g = new Gson();
			return g.toJson(cursoService.delete(id));
		}
	//
	//Buscar Cursos	
		@RequestMapping(path = "/buscarCurso", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody String buscarCurso(HttpServletRequest request) {
	        int id = Integer.parseInt(request.getParameter("id"));
	        //JOptionPane.showMessageDialog(null, id+" ");
			Gson g = new Gson();
			//JOptionPane.showMessageDialog(null, g.toJson(cursoService.read(id)));
			return g.toJson(cursoService.read(id));
		}
	//Actualizar Cursos
		@RequestMapping(path = "/actualizarCurso", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody String actualizarCurso(HttpServletRequest request) {
			String nombre = request.getParameter("nombre");
			int iddocente = Integer.parseInt(request.getParameter("iddocente"));
	        int id = Integer.parseInt(request.getParameter("id"));
	        Curso curso = new Curso(id, nombre, iddocente);
			Gson g = new Gson();
			return g.toJson(cursoService.update(curso));
		}
		
	}
