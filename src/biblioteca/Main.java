package biblioteca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Libro libro1 = new Libro("Los Viajes de Mahoma", "Mahoma", 150, Estado.DISPONIBLE);
		Libro libro2 = new Libro("Las 202 Noches", "Montezuma", 202, Estado.DISPONIBLE);
		Libro libro3 = new Libro("NO ABRAS ESTE LIBRO", "Skinner", 507, Estado.PRESTADO);
		Libro libro4 = new Libro("El Sopor de los Anillos", "Toyquien", 6093, Estado.DISPONIBLE);
		Libro libro5 = new Libro("Harry Pórrez", "Pocholo", 35, Estado.DISPONIBLE);
		
		Libreria libreria = new Libreria("Librolandia");
		
		libreria.addLibro(libro1);
		libreria.addLibro(libro2);
		libreria.addLibro(libro3);
		libreria.addLibro(libro4);
		
		System.out.println("Primera lista:");
		System.out.println(libreria.toString());
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		
		System.out.println("Get nombre:");
		System.out.println(libreria.getNombre());
		System.out.println("Cuantos libros:");
		System.out.println(libreria.cuantosLibros());
		libreria.addLibro(libro5);
		System.out.println("Segunda lista:");
		System.out.println(libreria.toString());
		System.out.println("!!!!!!!!!!!!!!!");
		System.out.println("Get libro 1: ");
		System.out.println(libreria.getLibro("Los Viajes de Mahoma"));
		System.out.println("Get libro 2:");
		System.out.println(libreria.getLibro2("Skinner"));
		libreria.borrarLibro("Tolkien");
		System.out.println("En el anterior no se deberia borrar nada, en el siguiente si");
		libreria.borrarLibro("Montezuma");
		libreria.librosPrestados();
		libreria.prestarLibro(libro4);
		libreria.prestarLibro(libro1);
		System.out.println("Tercera lista:");
		System.out.println(libreria.toString());
	}

}
