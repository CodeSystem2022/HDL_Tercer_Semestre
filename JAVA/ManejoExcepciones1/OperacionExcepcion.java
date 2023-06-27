package Leccion08.ManejoExcepciones1;

public class OperacionExcepcion extends RuntimeException {
    //Constructor
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
