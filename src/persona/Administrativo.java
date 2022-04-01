package persona;

public class Administrativo {
    private int idAdministrativo;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
    private String cargo;
    private String turno;
    private static int contadorAdmin;
    
    private Administrativo(){
        this.idAdministrativo = ++Administrativo.contadorAdmin;
    }
    public Administrativo(String nombre, String apellido, int edad, String direccion, String telefono, String cargo, String turno){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.turno = turno;
    }

    public String getCurso() {
        return this.cargo;
    }

    public void setCurso(String curso) {
        this.cargo = curso;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public static int getContadorAdministrativo() {
        return contadorAdmin;
    }

    public static void setContadorAdministrativo(int contadorAdmin) {
        Administrativo.contadorAdmin = contadorAdmin;
    }

    public int getIdAdministrativo() {
        return idAdministrativo;
    }
     
     @Override
    public String toString() {
        return "-----------------|ADMINISTRATIVO|----------------- " 
                + "\n -Nombre: " + this.nombre 
                + "\n -Apellido: " + this.apellido 
                + "\n -Edad: " + this.edad 
                + "\n -Direccion: " + this.direccion 
                + "\n -Telefono: " + this.telefono
                + "\n -Cargo: " + this.cargo 
                + "\n -Turno: " + this.turno ;
    }
}
