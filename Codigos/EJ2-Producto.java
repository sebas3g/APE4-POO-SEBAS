public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrar() {
        System.out.print(nombre + " : " + precio);

        if (stock < 5) {
            System.out.print(" : Reponer");
        }

        System.out.println();
    }
}
