package pe.edu.upeu.abcjdbc.daoImp;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.abcjdbc.dao.HabitacionDAO;
import pe.edu.upeu.abcjdbc.entity.Habitacion;

public class HabitacionDaoImpl implements HabitacionDAO{
	
	private JdbcTemplate jdbcTemplate;

	public HabitacionDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int create(Habitacion h) {
		// TODO Auto-generated method stub
		return 0;
		/*int x = 0;
		String sql = "INSERT INTO docente(iddocente, nombres, apellidos) VALUES(?,?,?)";
		try {
			jdbcTemplate.update(sql, new Object[] {d.getIddocente(), d.getNombres(), d.getApellidos()});
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;*/
	}

	public int update(Habitacion h) {
		return 0;
		// TODO Auto-generated method stub
		/*int x = 0;
		String sql = "UPDATE docente SET nombres =?, apellidos =? WHERE iddocente =?";
		try {
			jdbcTemplate.update(sql, new Object[] { d.getNombres(), d.getApellidos(), d.getIddocente() });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;*/
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "DELETE FROM habitacion WHERE idhabitacion =?";
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
	public Habitacion read(int id) {
		// TODO Auto-generated method stub
		Habitacion habitacion = (Habitacion) jdbcTemplate.queryForObject("SELECT * FROM habitacion WHERE idhabitacion = ?",
				new Object[] {id}, new BeanPropertyRowMapper(Habitacion.class));
		return habitacion;
	}

	public List<Map<String, Object>> readAll() {
		String sql = "SELECT * FROM habitacion";
		List<Map<String, Object>> lista = jdbcTemplate.queryForList(sql);
		return lista;
	}

}
