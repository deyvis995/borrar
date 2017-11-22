package pe.edu.upeu.abcjdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.abcjdbc.dao.DocenteDAO;
import pe.edu.upeu.abcjdbc.entity.Docente;
import pe.edu.upeu.abcjdbc.service.DocenteService;

@Service
public class DocenteServiceImp implements DocenteService{
	
    @Autowired
    DocenteDAO docenteDAO;
    
	public int create(Docente d) {
		// TODO Auto-generated method stub
		int x = 0;
		try {
			docenteDAO.create(d);
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return x;
	}

	public int update(Docente d) {
		// TODO Auto-generated method stub
		int x = 0;
		try {
			docenteDAO.update(d);
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
			docenteDAO.delete(id);
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return x;
	}

	public Docente read(int id) {
		// TODO Auto-generated method stub
		return docenteDAO.read(id);
	}

	public List<Map<String,Object>> readAll() {
		// TODO Auto-generated method stub
		return docenteDAO.readAll();
	}

}
