import java.util.ArrayList;
import java.util.List;
import java.util.Objects; // .equals()

public class Curso {
    private String nombre;
    private String codigo;
    private List<Alumno> listaAlumnos; // Lista para contener alumnos

    // Constructor con parámetros
    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaAlumnos = new ArrayList<>(); // Lista vacía al crear Curso
    }

    // Gestión de Alumnos

    public boolean agregarAlumno(Alumno alumno) {
        // Validación
        if (buscarAlumnoPorMatricula(alumno.getMatricula()) != null) {
            System.out.println("Error: El alumno con matrícula " + alumno.getMatricula() + " ya está inscrito en el curso.");
            return false;
        }
        listaAlumnos.add(alumno);
        System.out.println("Alumno " + alumno.getNombre() + " agregado al curso " + this.nombre + ".");
        return true;
    }

    public boolean eliminarAlumno(String matricula) {
        Alumno alumnoAEliminar = buscarAlumnoPorMatricula(matricula);

        if (alumnoAEliminar != null) {
            listaAlumnos.remove(alumnoAEliminar);
            System.out.println("Alumno con matrícula " + matricula + " eliminado del curso " + this.nombre + ".");
            return true;
        }

        System.out.println("Error: Alumno con matrícula " + matricula + " no encontrado en el curso.");
        return false;
    }

    public Alumno buscarAlumnoPorMatricula(String matricula) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getMatricula().equals(matricula)) {
                return alumno; // Alumno encontrado
            }
        }
        return null; // No pertenece al curso
    }

    public boolean perteneceAlCurso(String matricula) {
        return buscarAlumnoPorMatricula(matricula) != null;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    // Modificación del method toString()
    @Override
    public String toString() {
        // Construye una cadena con el detalle del curso y la lista de alumnos
        StringBuilder sb = new StringBuilder();
        sb.append("\n==========================================\n"); // Decorativo
        sb.append("Detalles del Curso:\n");
        sb.append("  Nombre: ").append(nombre).append('\n');
        sb.append("  Código: ").append(codigo).append('\n');
        sb.append("  Total Alumnos: ").append(listaAlumnos.size()).append('\n');
        sb.append("==========================================\n");

        if (listaAlumnos.isEmpty()) {
            sb.append("El curso no tiene alumnos inscritos actualmente.\n");
        } else {
            sb.append("Lista de Alumnos:\n");
            for (Alumno alumno : listaAlumnos) {
                // Utiliza el toString() de la clase Alumno
                sb.append("  - ").append(alumno.toString()).append('\n');
            }
        }
        sb.append("==========================================\n");
        return sb.toString();
    }
}
