package pe.edu.upeu.abcjdbc.entity;

public class Curso {
	private int idcurso;
	private String nombre;
	private int iddocente;
	public Curso() {
		super();
	}
	public Curso(String nombre, int iddocente) {
		super();
		this.nombre = nombre;
		this.iddocente = iddocente;
	}
	public Curso(int idcurso) {
		super();
		this.idcurso = idcurso;
	}
	public Curso(int idcurso, String nombre, int iddocente) {
		super();
		this.idcurso = idcurso;
		this.nombre = nombre;
		this.iddocente = iddocente;
	}
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIddocente() {
		return iddocente;
	}
	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}
}
