package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Libreria {

	private List<Libro> libros;
	private String nombre;
	
	public Libreria(String nombre) {
		libros = new ArrayList<>();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int cuantosLibros() {
		return libros.size();
		
	}
	
	public void addLibro(Libro libro) {
		libros.add(libro);
	}
	
	public Libro getLibro(String titulo) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro libro = it.next();
			if(libro.getTitulo().equals(titulo)){
				
				return libro;
			}
		}return null;
		
	}
	
	public boolean getLibro2(String autor) {
		int counter = 0;
		while(counter < libros.size()) {
			if(libros.get(counter).getAutor().equalsIgnoreCase(autor)) {
				return true;
			}counter++;
		}return false;
	}
	
	public void borrarLibro(String autor) {
		int counter = 0;
		int sizeInicial = libros.size();
		while(counter < libros.size()) {
			if(libros.get(counter).getAutor().equalsIgnoreCase(autor)) {
				libros.remove(counter);
				System.out.println("Libro borrado");
			}
		counter++;}if(sizeInicial == libros.size()) {
			System.out.println("No se borró nada wei");
		}
	}

	public void librosPrestados() {
		for(Libro l : libros) {
			if(l.estaPrestado() == Estado.PRESTADO) {
				System.out.println(l.toString());
			}
		}
	}
	
	public void prestarLibro(Libro l) {
		if(libros.contains(l)) {
			if(l.estaPrestado().equals(Estado.DISPONIBLE)) {
				l.prestar();
			}else {System.out.println("El libro ya está prestado");}
		}else {System.out.println("No existe semejante libro");}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libreria [libros=");
		builder.append(libros);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
