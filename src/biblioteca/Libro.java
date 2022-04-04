package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Libro {

	private String titulo;
	private String autor;
	private int paginas;
	private Estado estado;
	private LocalDate fechaPrestamo;

	public Libro(String titulo, String autor, int paginas, Estado estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Estado estaPrestado() {
		return estado;
	}

	public void prestar() {
		if (this.estado == Estado.DISPONIBLE) {
			this.estado = Estado.PRESTADO;
			this.fechaPrestamo = LocalDate.now();

		} else {
			System.out.println("AAAAAAAAAAAAAAAAAAAAH!");

		}

		
		
	}

	public String obtenerFechaPrestamo() {
		LocalDate hoy = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy");
		dtf.format(hoy);
		
		return this.fechaPrestamo.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Libro))
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titulo=");
		builder.append(titulo);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", estado=");
		builder.append(estado);
		if(this.fechaPrestamo != null) {
			builder.append(", fecha de préstamo = " + fechaPrestamo);
			
		}
		builder.append("]");
		return builder.toString();
	}

}
