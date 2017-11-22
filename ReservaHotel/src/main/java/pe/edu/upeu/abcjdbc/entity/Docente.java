package pe.edu.upeu.abcjdbc.entity;

public class Docente {
private int iddocente;
private String nombres;
private String apellidos;
public Docente() {
	super();
}
public Docente(String nombres, String apellidos) {
	super();
	this.nombres = nombres;
	this.apellidos = apellidos;
}

public Docente(int iddocente, String nombres, String apellidos) {
	super();
	this.iddocente = iddocente;
	this.nombres = nombres;
	this.apellidos = apellidos;
}
public int getIddocente() {
	return iddocente;
}
public void setIddocente(int iddocente) {
	this.iddocente = iddocente;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


}
