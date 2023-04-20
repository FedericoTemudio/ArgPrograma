package libreria;

import java.util.List;

import java.util.ArrayList;

class CarritoCompra {
	double total;
	
	
	private ArrayList<Libreria>items;

	public CarritoCompra() {
		this.items = new ArrayList<Libreria>();
	}

	public void agregarLibro(Libro ic) {
		this.items.add(ic);
	}

	public void quitarLibro(Libro ic) {
		this.items.remove(ic);
	}
	
	public void agregarRevista(Revista ic) {
		this.items.add(ic);
	}

	public void quitarRevista(Revista ic) {
		this.items.remove(ic);
	}

	
	public void mostrarCarrito() {

		if(items.isEmpty()) {
			System.out.println("No hay productos en el carrito");
		}else {
			for(Libreria i: items) {
				System.out.println(i.getTitulo());
			}
		}
	}
	
	
	public void mostrarTotal() {
		for(Libreria i: items) {
			total = total + i.getPrecioDeVenta();
		}
		System.out.println(total);
	}
	
}
