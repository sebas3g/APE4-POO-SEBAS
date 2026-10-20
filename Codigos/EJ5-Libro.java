public class Libro {
    String titulo;
    String autor;
    boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public void mostrar() {
        if (disponible) {
            System.out.println(titulo + " : Disponible");
        } else {
            System.out.println(titulo + " : Prestado");
        }
    }
}
