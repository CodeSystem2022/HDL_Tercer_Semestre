// Leccion 10, video 3 a 10:

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Personas {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacio
    public Personas(){
        this.id = ++Personas.numeroPersonas;
    }

    //Constructor con parametros(sobrecarga de constructores)
    public Personas(String nombre, String tel, String email){
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Personas> personas = new ArrayList<>();
        //Empezamos con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu(){
        //Mostramos las opciones
        System.out.print("****** Listado de Personas ******\n" + "1. Agregar\n" + "2. Listar\n" + "3: Salir\n");
        System.out.print("Digite una de las opciones: ");
    }

    private static boolean ejecutarOperacion(Scanner entrada, List<Personas> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
       
        switch (opcion){
            case 1 -> {
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite  el correo: ");
                var email = entrada.nextLine(); 
                var persona = new Personas(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size()+" elementos");
            }
            case 2 -> {//Listar a las personas
                System.out.println("Listado de personas: ");
                
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion incorrecta: "+opcion);
        }
        return salir;
    }//Fin del método ejecutarOperacion
}//Fin de la clase ListadoPersonasApp
