public class Libro {
private String titulo;
private String autor; private String genero; private boolean disponible; private String isbn;
public Libro(String titulo, String autor, String genero, String isbn) { this.titulo = titulo;
this.autor = autor;
this.genero = genero;
this.isbn = isbn;
this.disponible = true; }
public boolean consultarDisponibilidad() { return disponible;
}
public void marcarComoPrestado() { disponible = false;
}
public void marcarComoDisponible() { disponible = true;
}
public String getTitulo() { return titulo;
}
public String getAutor() { return autor;
} }
