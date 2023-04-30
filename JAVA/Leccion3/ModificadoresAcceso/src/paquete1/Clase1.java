package paquete1;

public class Clase1 {
    // Atributo
    public String atributoPublic = "Valor Atributo Publico";
    protected String atributoProtected = "Valor Atributo Protected";
    
    // Constructor
    public Clase1(){
        System.out.println("Constructo publico");
    }
    protected Clase1(String atributoPublic){
        System.out.println("Constructor protected");
    }
    // Metodos
    public void metodoPublico(){
        System.out.println("Metodo Publico");
    }
    protected void metodoProtected(){
        System.out.println("Metodo Protected");
    }
}
