    public static void main(String[] args) {
        Producto p1 = new Producto("Arroz", 1.50, 10);
        Producto p2 = new Producto("Leche", 1.00, 7);
        Producto p3 = new Producto("Pan", 0.25, 4);
        Producto p4 = new Producto("Aceite", 3.50, 8);

        // Mostrar productos inicialmente
        System.out.println("Inventario inicial:");
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        p4.mostrar();

        // Simular la venta de 3 unidades de dos productos
        p1.stock -= 3;
        p2.stock -= 3;

        Producto[] productos = {p1, p2, p3, p4};
        double total = 0;

        System.out.println("\nInventario final:");

        for (Producto p : productos) {
            p.mostrar();
            total += p.precio * p.stock;
        }

        System.out.printf("Valor total del inventario: $%.2f%n", total);
    }
