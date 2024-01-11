package ec.edu.ups.ppw63.demo63.services;

public class ErrorMessage {

	private int codigo;
	private String mensaje;
	
	public ErrorMessage(int codigo, String mensaje) {
		this.codigo = codigo;
		this.mensaje = mensaje;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
