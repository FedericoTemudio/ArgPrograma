package libreria;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		
		Libro l1= new Libro("titulo1","autor","editorial",123,310,false);
		Libro l2= new Libro("titulo2","autor","editorial",123,255,false);
		Libro l3= new Libro("titulo3","autor","editorial",123,220,false);
		Libro l4= new Libro("titulo4","autor","editorial",123,120,true);
		Libro l5= new Libro("titulo5","autor","editorial",123,200,true);
		
		Revista r1= new Revista("Revista1","editor",123,134,true);
		
		CarritoCompra c = new CarritoCompra();
		
		
		c.agregarLibro(l1);
		c.agregarLibro(l2);
		c.agregarLibro(l3);
		c.agregarLibro(l4);
		c.agregarLibro(l5);
		c.agregarRevista(r1);

		c.quitarLibro(l2);
		
		c.mostrarCarrito();
		c.mostrarTotal();
	}

}
