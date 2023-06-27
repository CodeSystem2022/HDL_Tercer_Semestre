package Leccion08.ManejoExcepciones1;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if(denominador == 0){
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }
}
