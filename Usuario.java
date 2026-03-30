import java.util.ArrayList; import java.util.List;
public class Usuario {
private String nombre;
private String apellido;
private String numeroIdentificacion; private List<Prestamo> listaPrestamos; private static final int MAX_LIBROS = 3;
public Usuario(String nombre, String apellido, String numeroIdentificacion) { this.nombre = nombre;
this.apellido = apellido;
this.numeroIdentificacion = numeroIdentificacion;
this.listaPrestamos = new ArrayList<>(); }
public boolean puedePrestar() {
return listaPrestamos.size() < MAX_LIBROS;
}
public void agregarPrestamo(Prestamo prestamo) { listaPrestamos.add(prestamo);
}
public void eliminarPrestamo(Prestamo prestamo) { listaPrestamos.remove(prestamo);
}
public List<Prestamo> obtenerPrestamosActivos() { return listaPrestamos;
} }
