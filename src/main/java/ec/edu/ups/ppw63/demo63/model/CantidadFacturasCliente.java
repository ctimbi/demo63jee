package ec.edu.ups.ppw63.demo63.model;

public class CantidadFacturasCliente {

	private int codigo_cliente;
	private String nombre;
	private int cantidad_facturas;
	
	public CantidadFacturasCliente(int codigo_cliente, String nombre, int cantidad_facturas) {
		this.codigo_cliente = codigo_cliente;
		this.nombre = nombre;
		this.cantidad_facturas = cantidad_facturas;
	}

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad_facturas() {
		return cantidad_facturas;
	}

	public void setCantidad_facturas(int cantidad_facturas) {
		this.cantidad_facturas = cantidad_facturas;
	}

	@Override
	public String toString() {
		return "CantidadFacturasCliente [codigo_cliente=" + codigo_cliente + ", nombre=" + nombre
				+ ", cantidad_facturas=" + cantidad_facturas + "]";
	}
	
	
	
	
}
