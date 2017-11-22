package pe.edu.upeu.abcjdbc.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.abcjdbc.entity.Curso;

public interface CursoService {
	public int create(Curso c);
	public int update(Curso c);
	public int delete(int id);
	public Curso read(int id);
	public List<Map<String,Object>> readAll();
}
