package herenciacolegio;

import persona.*;
import java.io.*;
import java.util.Scanner;

public class HerenciaColegio {

    //Declaracion de Arreglo
    static Estudiante alumnos[] = null;
    static Administrativo admin[] = null;

    //Contador
    static int cont = 0;
    static int cont2 = 0;

    //Lectura y captura del teclado reemplaza a la funcion Scanner
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader lector = new BufferedReader(isr);

   
    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);

        //Inicializar arreglo
        alumnos = new Estudiante[5];
        admin = new Administrativo[5];

        //inicializar opcion
        int opcion = 0;

        //Menu
        do {
            System.out.println("-----------|MENÚ |-----------");
            System.out.println("");
            System.out.println("1.-Ingresar Estudiante");
            System.out.println("2.-Consultar Estudiantes");
            System.out.println("3.-Ingresar Administrativo");
            System.out.println("4.-Consultar Administrativo");
            System.out.println("5.-Salir");
            System.out.println("");
            System.out.print("Por favor, seleccione una opción: ");
            opcion = Integer.parseInt(lector.readLine());

            switch (opcion) {
                case 1:
                    if (cont < 5) {
                        agregarAlumno();
                    } else {
                        System.out.println("\nNo hay cupos");
                    }
                    break;
                case 2:
                    listarAlumno();
                    break;
                case 3:
                    if (cont2 < 5) {
                        agregarAdmin();
                    } else {
                        System.out.println("\nNo hay cupos");
                    }
                    break;
                case 4:
                    listarAdmin();
                    break;
                case 5:
                    System.out.println("\nSaliendo...");
            }
        } while (opcion != 5);
        System.exit(0);
    }

    private static void agregarAlumno() throws IOException {

        String nombre;
        String apellido;
        int edad;
        String direccion;
        String telefono;
        String curso;
        String turno;

        //Lectura de datos:
        System.out.println("\n\n\n");
        System.out.println("---------------------------------");
        System.out.println("        REGISTRO DE ALUMNO       ");
        System.out.println("---------------------------------");

        System.out.print("Nombre: ");
        nombre = lector.readLine();
        System.out.print("Apellido: ");
        apellido = lector.readLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(lector.readLine());
        System.out.print("Direccion: ");
        direccion = lector.readLine();
        System.out.print("Telefono: ");
        telefono = lector.readLine();
        System.out.print("Curso: ");
        curso = lector.readLine();
        System.out.print("Turno: ");
        turno = lector.readLine();

        //Agregar elementos a la coleccion:
        alumnos[cont] = new Estudiante(nombre, apellido, edad, direccion, telefono, curso, turno);
        cont++;
        System.out.println("\n Alumno agregado ¡con exito!: " + cont);

    }

    private static void listarAlumno() {
        for (int i = 0; i < cont; i++) {
            System.out.println("\n\n-- LISTADO DE ALUMNOS --");
            System.out.println("" + alumnos[i].toString());

        }
    }
     private static void agregarAdmin() throws IOException {

        String nombre;
        String apellido;
        int edad;
        String direccion;
        String telefono;
        String cargo;
        String turno;

        //Lectura de datos:
        System.out.println("\n\n\n");
        System.out.println("---------------------------------");
        System.out.println("    REGISTRO DE ADMINISTRATIVO   ");
        System.out.println("---------------------------------");

        System.out.print("Nombre: ");
        nombre = lector.readLine();
        System.out.print("Apellido: ");
        apellido = lector.readLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(lector.readLine());
        System.out.print("Direccion: ");
        direccion = lector.readLine();
        System.out.print("Telefono: ");
        telefono = lector.readLine();
        System.out.print("Cargo: ");
        cargo = lector.readLine();
        System.out.print("Turno: ");
        turno = lector.readLine();

        //Agregar elementos a la coleccion:
        admin[cont2] = new Administrativo(nombre, apellido, edad, direccion, telefono, cargo, turno);
        cont2++;
        System.out.println("\n Administrativo Agregado ¡con exito!: " + cont2);

    }

    private static void listarAdmin() {
        for (int i = 0; i < cont2; i++) {
            System.out.println("\n\n-- LISTADO ADMINISTRATIVO --");
            System.out.println("" + admin[i].toString());

        }
    }

}
