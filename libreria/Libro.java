package libreria;

import java.time.LocalDate;

public class Libro extends Libreria {

	protected String autorPrincipal;
	protected String editorial;
	protected boolean fisico;
	
	public Libro(String titulo, String autorPrincipal, String editorial, int codigo,double precioCompra,boolean fisico) {
		super(titulo,codigo,precioCompra);
		this.autorPrincipal = autorPrincipal;
		this.editorial = editorial;
		this.fisico=fisico;
	}


	public String getAutorPrincipal() {
		return autorPrincipal;
	}
	public void setAutorPrincipal(String autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public double getPrecioDeVenta() {
		if (fisico==true) {
		return super.precioCompra + (super.precioCompra*18/100);
	}else {
		return super.precioCompra + (super.precioCompra*8/100);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
