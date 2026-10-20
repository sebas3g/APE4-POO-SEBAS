public class Socio {
    String nombre;
    int librosPrestados;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public void prestarLibro(Libro libro) {
        if (libro.disponible) {
            libro.disponible = false;
            librosPrestados++;
        }
    }

    public void mostrar() {
        System.out.println(nombre + " : " + librosPrestados);
    }
}
