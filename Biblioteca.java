import java.util.ArrayList; import java.util.List;
public class Biblioteca {
private List<Libro> listaLibros;
private List<Usuario> listaUsuarios; private List<Prestamo> listaPrestamos;
public Biblioteca() {
listaLibros = new ArrayList<>(); listaUsuarios = new ArrayList<>(); listaPrestamos = new ArrayList<>();
}
public void registrarLibro(Libro libro) { listaLibros.add(libro);
}
public void registrarUsuario(Usuario usuario) { listaUsuarios.add(usuario);
}
public boolean prestarLibro(Usuario usuario, Libro libro) {
if (libro.consultarDisponibilidad() && usuario.puedePrestar()) { Prestamo prestamo = new Prestamo(libro, usuario);
listaPrestamos.add(prestamo); usuario.agregarPrestamo(prestamo); libro.marcarComoPrestado();
return true; }
return false; }
public void devolverLibro(Prestamo prestamo) {
prestamo.registrarDevolucion();
prestamo.getUsuario().eliminarPrestamo(prestamo); }
}
