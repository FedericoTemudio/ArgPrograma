package libreria;

import java.time.LocalDate;

public class Revista extends Libreria{

	protected String editor;
	protected boolean fisico;

	
	
	
	public Revista(String titulo, String editor, int codigo,int precioCompra,boolean fisico) {
		super(titulo,codigo,precioCompra);
		this.editor = editor;
		this.fisico = fisico;
		
	}
	
	
	public String getEditor() {
		return this.editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}

	public double getPrecioDeVenta() {
		if (fisico==true) {
		return super.precioCompra + (super.precioCompra*22/100);
	}else {
		return super.precioCompra + (super.precioCompra*12/100);
		}
	}





}
