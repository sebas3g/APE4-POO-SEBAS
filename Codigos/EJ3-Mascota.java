public class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    public Mascota(String nombre, String especie,
                   int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public void mostrar() {
        System.out.print(nombre + " : " + especie + " : " + peso);

        if (peso > 20) {
            System.out.print(" : Revisar peso");
        }

        System.out.println();
    }
}
