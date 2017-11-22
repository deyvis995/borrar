package pe.edu.upeu.abcjdbc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.abcjdbc.entity.Curso;
import pe.edu.upeu.abcjdbc.entity.Docente;
import pe.edu.upeu.abcjdbc.service.CursoService;
import pe.edu.upeu.abcjdbc.service.DocenteService;

@Controller
public class HomeController {
	@Autowired
	private DocenteService docenteService;

	@Autowired
	private CursoService cursoService;

	// Listar Docente
	@RequestMapping(path = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getAllEmployee() {
		Gson g = new Gson();
		return g.toJson(docenteService.readAll());
	}

	// Guardar Docente
	@RequestMapping(path = "/guardarDocente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String guardarDocente(HttpServletRequest request) {
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		Docente d = new Docente(nombres, apellidos);
		Gson g = new Gson();
		return g.toJson(docenteService.create(d));
	}

	// Eliminar Docente
	@RequestMapping(path = "/eliminarDocente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String eliminarDocente(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Gson g = new Gson();
		return g.toJson(docenteService.delete(id));
	}

	//
	// Buscar Docente
	@RequestMapping(path = "/buscarDocente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String buscarDocente(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Gson g = new Gson();
		return g.toJson(docenteService.read(id));
	}

	// Actualizar Docente
	@RequestMapping(path = "/actualizarDocente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String actualizarDocente(HttpServletRequest request) {
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		int id = Integer.parseInt(request.getParameter("id"));
		Docente d1 = new Docente(id, nombres, apellidos);
		Gson g = new Gson();
		return g.toJson(docenteService.update(d1));
	}
}
