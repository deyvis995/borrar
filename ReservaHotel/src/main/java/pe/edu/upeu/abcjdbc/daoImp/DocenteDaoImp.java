package pe.edu.upeu.abcjdbc.daoImp;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.abcjdbc.dao.DocenteDAO;
import pe.edu.upeu.abcjdbc.entity.Docente;


public class DocenteDaoImp implements DocenteDAO {
	
	private JdbcTemplate jdbcTemplate;
	 
    public DocenteDaoImp(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }	

	public int create(Docente d) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "INSERT INTO docente(iddocente, nombres, apellidos) VALUES(?,?,?)";
		try {
			jdbcTemplate.update(sql, new Object[] {d.getIddocente(), d.getNombres(), d.getApellidos()});
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	public int update(Docente d) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "UPDATE docente SET nombres =?, apellidos =? WHERE iddocente =?";
		try {
			jdbcTemplate.update(sql, new Object[] { d.getNombres(), d.getApellidos(), d.getIddocente() });
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
		String sql = "DELETE FROM docente WHERE iddocente =?";
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
	public Docente read(int id) {
		// TODO Auto-generated method stub
		Docente docente = (Docente) jdbcTemplate.queryForObject("SELECT * FROM docente where iddocente = ? ",
				new Object[] { id }, new BeanPropertyRowMapper(Docente.class));
		return docente;
	}

	public List<Map<String,Object>> readAll() {
		String sql = "SELECT * FROM docente";
		List<Map<String, Object>> lista = jdbcTemplate.queryForList(sql);
		return lista;
	}

}
