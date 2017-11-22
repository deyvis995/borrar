package pe.edu.upeu.abcjdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.abcjdbc.entity.Docente;

public interface DocenteDAO{
	public int create(Docente d);
	public int update(Docente d);
	public int delete(int id);
	public Docente read(int id);
	public List<Map<String,Object>> readAll();
}
