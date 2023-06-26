package Leccion03.ModificadoresAcceso;

public class ClaseHija2 extends Clase2 {

    public ClaseHija2(){
        super();
        this.atributoDefaulf = "Modificacion del atributo Defaul";
        System.out.println("atributoDefaulf = " + this.atributoDefaulf);
        this.metodoDefaulf();
    }
    
}
