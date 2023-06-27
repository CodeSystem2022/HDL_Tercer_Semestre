package Leccion08.ManejoExcepciones1;

import static Leccion08.ManejoExcepciones1.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);

        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out); // Se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("La variable de resultado tien como valor: " + resultado);
    }
}
