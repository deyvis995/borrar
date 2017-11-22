package pe.edu.upeu.abcjdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.abcjdbc.dao.HabitacionDAO;
import pe.edu.upeu.abcjdbc.entity.Habitacion;
import pe.edu.upeu.abcjdbc.service.HabitacionService;

@Service
public class HabitacionServiceImpl implements HabitacionService{

	@Autowired
	HabitacionDAO habitacionDAO;
	
	public int create(Habitacion h) {
		// TODO Auto-generated method stub
		int x = 0;
		try {
			habitacionDAO.create(h);
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return x;
	}

	public int update(Habitacion h) {
		// TODO Auto-generated method stub
		int x = 0;
		try {
			habitacionDAO.update(h);
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
			habitacionDAO.delete(id);
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return x;
	}

	public Habitacion read(int id) {
		// TODO Auto-generated method stub
		return habitacionDAO.read(id);
	}

	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return habitacionDAO.readAll();
	}

}
