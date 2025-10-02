public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio de Pruebas POO: Alumnos y Cursos");

        // 1. Instanciación de 5 objetos de tipo Alumno

        // COnstrucción de Alumnos con parámetros
        Alumno a1 = new Alumno("Catalina", "Sepúlveda", "19123456-K", "Ingeniería Civil Informática");
        Alumno a2 = new Alumno("Andrés", "Riquelme", "20987654-2", "Derecho");
        Alumno a3 = new Alumno("Sofía", "Castro", "18456789-0", "Medicina");
        Alumno a4 = new Alumno("Javier", "Morales", "21000111-9", "Ingeniería Civil Informática");

        // 5to Alumno usando el constructor sin parámetros
        Alumno a5 = new Alumno();
        a5.setNombre("Martín");
        a5.setApellido("Vargas");
        a5.setCarrera("Ingeniería Civil Mecánica");

        // Prueba de Getters y Setters
        System.out.println("\nPruebas de la Clase Alumno");
        System.out.println("Datos A1 (antes de cambio): " + a1.toString());
        a1.setCarrera("Ingeniería Civil Industrial"); // Se cambia la carrera
        System.out.println("Datos A1 (después de cambio de carrera): " + a1.toString());
        System.out.println("Matrícula de A3 (Getter): " + a3.getMatricula());
        System.out.println("Datos A5 (por defecto y luego set): " + a5.toString());

        // 2. Instanciación de un objeto de tipo Curso

        System.out.println("\nPruebas de la Clase Curso");
        Curso pooCurso = new Curso("Programación Orientada a Objetos", "ICC490-1");

        // 3. Ejecución de métodos: Agregar Alumnos
        System.out.println("\nAgregar Alumnos");
        pooCurso.agregarAlumno(a1);
        pooCurso.agregarAlumno(a2);
        pooCurso.agregarAlumno(a3);
        pooCurso.agregarAlumno(a4);
        pooCurso.agregarAlumno(a5);

        // Prueba de validación: Intentar agregar un alumno duplicado (a1)
        pooCurso.agregarAlumno(a1);

        // 4. Ejecución de métodos: Mostrar Curso (toString)
        System.out.println("\nEstado Actual del Curso");
        System.out.println(pooCurso.toString());

        // 5. Ejecución de métodos: Pertenencia y Eliminación

        // Probar si un alumno pertenece (con matrícula que existe)
        String matA3 = a3.getMatricula();
        System.out.println("\nBúsqueda de Alumnos");
        System.out.println("¿El alumno con matrícula " + matA3 + " pertenece al curso? " +
                pooCurso.perteneceAlCurso(matA3));

        // Probar si un alumno pertenece (con matrícula que no existe)
        String matInexistente = "11111111-1";
        System.out.println("¿El alumno con matrícula " + matInexistente + " pertenece al curso? " +
                pooCurso.perteneceAlCurso(matInexistente));

        // Eliminar un alumno (a4)
        String matA4 = a4.getMatricula();
        System.out.println("\nEliminar Alumno");
        pooCurso.eliminarAlumno(matA4);

        // Probar si el alumno eliminado aún pertenece
        System.out.println("¿El alumno con matrícula " + matA4 + " pertenece ahora? " +
                pooCurso.perteneceAlCurso(matA4));

        // Probar a eliminar uno que ya no está
        pooCurso.eliminarAlumno(matA4);

        // Mostrar el curso después de la eliminación
        System.out.println("\nEstado Final del Curso (tras eliminación)");
        System.out.println(pooCurso.toString());

        System.out.println("FIN DE PRUEBAS.");
    }
}