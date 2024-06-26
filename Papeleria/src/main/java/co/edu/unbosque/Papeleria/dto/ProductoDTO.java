package co.edu.unbosque.Papeleria.dto;

public class ProductoDTO {
	private String id_producto;
	private String nombre_producto;
	private int iva;
	private int costo_unitario;
	private int costo_total;
	private String descripcion;
	private int status;
	

	
	public ProductoDTO(String id_producto, String nombre_producto, int iva, int costo_unitario, int costo_total,
			String descripcion, int status) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.iva = iva;
		this.costo_unitario = costo_unitario;
		this.costo_total = costo_total;
		this.descripcion = descripcion;
		this.status = status;
	}

	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCosto_unitario() {
		return costo_unitario;
	}

	public void setCosto_unitario(int costo_unitario) {
		this.costo_unitario = costo_unitario;
	}

	public int getCosto_total() {
		return costo_total;
	}

	public void setCosto_total(int costo_total) {
		this.costo_total = costo_total;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


}

