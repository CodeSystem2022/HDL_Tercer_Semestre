/* Archivo de prueba*/
package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Alberto", 1000);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        Gerente gerente1 = new Gerente("Jose", 5000, "Sistemas");     
        //System.out.println("gerente1 = " +gerente1.obtenerDetalles());
        
        imprimir(empleado1);
        imprimir(gerente1);
    }
    
    /*Creamos metodo*/
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles = " + detalles);
    }
}
