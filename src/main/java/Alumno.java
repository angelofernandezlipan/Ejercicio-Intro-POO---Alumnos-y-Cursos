public class Alumno {
    // Atributos privados
    private String nombre;
    private String apellido;
    private final String matricula; // Final para hacerla inmutable
    private String carrera;

    // Constructor con parámetros
    public Alumno(String nombre, String apellido, String matricula, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Constructor sin parámetros
    public Alumno() {
        this.nombre = "Sin Nombre";
        this.apellido = "Sin Apellido";
        this.matricula = "00000000-0";
        this.carrera = "No Asignada";
    }

    // Getters y setters

    // Getters: Acceso de lectura
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula; // NO habrá setter para cambiarla
    }

    public String getCarrera() {
        return carrera;
    }

    // Setters: Acceso para escribir/modificar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Modificación del method toString()
    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre: '" + nombre + " " + apellido + '\'' +
                ", Matrícula: '" + matricula + '\'' +
                ", Carrera: '" + carrera + '\'' +
                '}';
    }
}