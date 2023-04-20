package libreria;

import java.time.LocalDate;

public abstract class Libreria {
	protected String titulo;
	protected double precioCompra;
	protected int codigo;
	//protected LocalDate fechaDePublicacion;
	
	
	public Libreria(String titulo,int codigo,double precioCompra) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.precioCompra = precioCompra;
	} 
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
 	
	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public abstract double getPrecioDeVenta();
}
