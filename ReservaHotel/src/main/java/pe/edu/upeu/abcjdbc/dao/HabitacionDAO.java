package pe.edu.upeu.abcjdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.abcjdbc.entity.Habitacion;

public interface HabitacionDAO {
	public int create(Habitacion h);
	public int update(Habitacion h);
	public int delete(int id);
	public Habitacion read(int id);
	public List<Map<String,Object>> readAll();
}
