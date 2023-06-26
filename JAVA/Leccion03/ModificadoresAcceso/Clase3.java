package Leccion03.ModificadoresAcceso;

public class Clase3 extends Clase1 {
    public Clase3() {
        super("Protected");
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("AtributoProtected =" + this.atributoProtected);
        this.atributoPublic = "es totalmente publico";
    }
}
