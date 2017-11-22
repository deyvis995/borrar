package pe.edu.upeu.abcjdbc.daoImp;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.abcjdbc.dao.CursoDAO;
import pe.edu.upeu.abcjdbc.entity.Curso;
import pe.edu.upeu.abcjdbc.entity.Docente;

public class CursoDaoImpl implements CursoDAO{
	private JdbcTemplate jdbcTemplate;

	public CursoDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int create(Curso c) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "INSERT INTO curso(idcurso, nombre, iddocente) VALUES(?,?,?)";
		try {
			jdbcTemplate.update(sql, new Object[] {c.getIdcurso(), c.getNombre(), c.getIddocente()});
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	public int update(Curso c) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "UPDATE curso SET nombre =?, iddocente =? WHERE idcurso =?";
		try {
			jdbcTemplate.update(sql, new Object[] { c.getNombre(), c.getIddocente(), c.getIdcurso() });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "DELETE FROM curso WHERE idcurso =?";
		try {
			jdbcTemplate.update(sql, new Object[] { id });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Curso read(int id) {
		// TODO Auto-generated method stub
		Curso curso = (Curso) jdbcTemplate.queryForObject("SELECT * FROM curso where idcurso = ? ",
				new Object[] { id }, new BeanPropertyRowMapper(Curso.class));
		return curso;
	}

	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM curso";
		List<Map<String, Object>> lista = jdbcTemplate.queryForList(sql);
		return lista;
	}
	
}
