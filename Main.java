public class Main {
    public static void main(String[] args) {
        // 1. Crear la biblioteca
        Biblioteca miBiblioteca = new Biblioteca();

        // 2. Crear algunos libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo Mágico", "978-0307350435");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela", "978-8420412146");

        // 3. Registrar libros en la biblioteca
        miBiblioteca.registrarLibro(libro1);
        miBiblioteca.registrarLibro(libro2);

        // 4. Crear un usuario
        Usuario usuario1 = new Usuario("Juan", "Pérez", "12345678");
        miBiblioteca.registrarUsuario(usuario1);

        // 5. Probar un préstamo
        System.out.println("Intentando prestar '" + libro1.getTitulo() + "' a " + usuario1.getNombre() + "...");
        
        if (miBiblioteca.prestarLibro(usuario1, libro1)) {
            System.out.println("✅ Préstamo exitoso.");
        } else {
            System.out.println("❌ No se pudo realizar el préstamo.");
        }

        // 6. Consultar disponibilidad después del préstamo
        System.out.println("¿Está disponible '" + libro1.getTitulo() + "'? " + (libro1.consultarDisponibilidad() ? "Sí" : "No"));
    }
}
