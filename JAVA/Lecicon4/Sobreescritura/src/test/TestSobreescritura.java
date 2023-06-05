/* Archivo de prueba*/
package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Jose", 5000, "Sistemas");
        Gerente gerente2 = new Gerente("Santiago", 400, "Ventas");
        System.out.println("gerente1 = " +gerente1.obtenerDetalles());
        System.out.println("gerente2 = " +gerente2.obtenerDetalles());
    }
}
