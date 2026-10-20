public static void main(String[] args) {
        Mascota m1 = new Mascota("Max", "Perro", 4, 25);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 5);
        Mascota m3 = new Mascota("Rocky", "Perro", 6, 18);

        m1.mostrar();
        m2.mostrar();
        m3.mostrar();

        Mascota m4 = m1;
        m4.edad++;

        System.out.println("Edad de m1: " + m1.edad);
    }
