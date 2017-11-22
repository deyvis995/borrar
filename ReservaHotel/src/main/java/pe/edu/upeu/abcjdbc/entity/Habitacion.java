package pe.edu.upeu.abcjdbc.entity;

public class Habitacion {
	private int idhabitacion;
	private String numero, piso, descripcion, caracteristicas;
	private Double precio_diario;
	private String tipohabitacion;

	public Habitacion() {
		super();
	}

	public Habitacion(String numero, String piso, String descripcion, String caracteristicas, Double precio_diario,
			String tipohabitacion) {
		super();
		this.numero = numero;
		this.piso = piso;
		this.descripcion = descripcion;
		this.caracteristicas = caracteristicas;
		this.precio_diario = precio_diario;
		this.tipohabitacion = tipohabitacion;
	}

	public Habitacion(int idhabitacion, String numero, String piso, String descripcion, String caracteristicas,
			Double precio_diario, String tipohabitacion) {
		super();
		this.idhabitacion = idhabitacion;
		this.numero = numero;
		this.piso = piso;
		this.descripcion = descripcion;
		this.caracteristicas = caracteristicas;
		this.precio_diario = precio_diario;
		this.tipohabitacion = tipohabitacion;
	}

	public int getIdhabitacion() {
		return idhabitacion;
	}

	public void setIdhabitacion(int idhabitacion) {
		this.idhabitacion = idhabitacion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Double getPrecio_diario() {
		return precio_diario;
	}

	public void setPrecio_diario(Double precio_diario) {
		this.precio_diario = precio_diario;
	}

	public String getTipohabitacion() {
		return tipohabitacion;
	}

	public void setTipohabitacion(String tipohabitacion) {
		this.tipohabitacion = tipohabitacion;
	}
}
