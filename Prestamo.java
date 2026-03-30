import java.util.Date; public class Prestamo {
private Libro libro;
private Usuario usuario; private Date fechaPrestamo; private Date fechaDevolucion; private boolean activo;
public Prestamo(Libro libro, Usuario usuario) { this.libro = libro;
this.usuario = usuario;
this.fechaPrestamo = new Date(); this.activo = true;
}
public void registrarDevolucion() { this.fechaDevolucion = new Date(); this.activo = false; libro.marcarComoDisponible();
}
public boolean estaActivo() { return activo;
}
public Libro getLibro() { return libro;
}
public Usuario getUsuario() { return usuario;
} }
