package pe.edu.upeu.abcjdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.abcjdbc.dao.CursoDAO;
import pe.edu.upeu.abcjdbc.entity.Curso;
import pe.edu.upeu.abcjdbc.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	CursoDAO cursoDAO;
	
	public int create(Curso c) {
		// TODO Auto-generated method stub
		int x = 0;
		try {
			cursoDAO.create(c);
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return x;
	}

	public int update(Curso c) {
		// TODO Auto-generated method stub
		int x = 0;
		try {
			cursoDAO.update(c);
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return x;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		int x = 0;
		try {
			cursoDAO.delete(id);
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return x;
	}

	public Curso read(int id) {
		// TODO Auto-generated method stub
		return cursoDAO.read(id);
	}

	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return cursoDAO.readAll();
	}

}
