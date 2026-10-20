    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 8, 9, 7);
        Estudiante e2 = new Estudiante("Luis", 6, 5, 6);
        Estudiante e3 = new Estudiante("María", 4, 3, 5);
        Estudiante e4 = new Estudiante("Pedro", 9, 8, 10);
        Estudiante e5 = new Estudiante("Sofía", 7, 6, 8);

        Estudiante[] estudiantes = {e1, e2, e3, e4, e5};
        int aprobados = 0;

        for (Estudiante e : estudiantes) {
            e.mostrar();

            if (e.promedio >= 7) {
                aprobados++;
            }
        }

        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}
