package paquete1;

public class ClaseHija2 extends Clase2 {
    public ClaseHija2(){
        super();
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
        
    }
    
}
