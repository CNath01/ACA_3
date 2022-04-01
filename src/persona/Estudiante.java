
package persona;


public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
    private String curso;
    private String turno;
    private static int contadorEstudiante;
    
    private Estudiante(){
        this.idEstudiante = ++Estudiante.contadorEstudiante;
    }
    public Estudiante(String nombre, String apellido, int edad, String direccion, String telefono, String curso, String turno){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.curso = curso;
        this.turno = turno;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public static int getContadorEstudiante() {
        return contadorEstudiante;
    }

    public static void setContadorEstudiante(int contadorEstudiante) {
        Estudiante.contadorEstudiante = contadorEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }
     
     @Override
    public String toString() {
        return "-----------------|ESTUDIANTES|----------------- " 
                + "\n -Nombre: " + this.nombre 
                + "\n -Apellido: " + this.apellido 
                + "\n -Edad: " + this.edad 
                + "\n -Direccion: " + this.direccion 
                + "\n -Telefono: " + this.telefono
                + "\n -Curso: " + this.curso 
                + "\n -Turno: " + this.turno ;
    }
}
