package ec.edu.ups.ppw63.demo63.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DetalleFactura {

	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	private int cantidad;
	private double precio;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "DetalleFactura [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
}
