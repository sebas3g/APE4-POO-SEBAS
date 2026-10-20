public class Estudiante {
    String nombre;
    double nota1, nota2, nota3, promedio;

    public Estudiante(String nombre, double nota1,
                      double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    public void mostrar() {
        calcularPromedio();

        System.out.printf("%s : %.2f : ", nombre, promedio);

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else if (promedio >= 5) {
            System.out.println("Supletorio");
        } else {
            System.out.println("Reprobado");
        }
    }
