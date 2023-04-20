package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);//IMPORTAR CLASE
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos objetos adicionales como parte de la tarea###########
        Monitor monitorLG = new Monitor("LG", 13);//IMPORTAR CLASE
        Teclado tecladoLG = new Teclado("Bluetooth", "LG");
        Raton ratonLG = new Raton("Bluetooth", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);
        
        Monitor monitorACER = new Monitor("ACER", 13);//IMPORTAR CLASE
        Teclado tecladoACER = new Teclado("Bluetooth", "ACER");
        Raton ratonACER = new Raton("Bluetooth", "ACER");
        Computadora computadoraACER = new Computadora("Computadora ACER", monitorACER, tecladoACER, ratonACER);
        
        Monitor monitorMSI = new Monitor("MSI", 13);//IMPORTAR CLASE
        Teclado tecladoMSI = new Teclado("Bluetooth", "MSI");
        Raton ratonMSI = new Raton("Bluetooth", "MSI");
        Computadora computadoraMSI = new Computadora("Computadora MSI", monitorMSI, tecladoMSI, ratonMSI);
        
        Monitor monitorDell = new Monitor("Dell", 13);//IMPORTAR CLASE
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        
        Monitor monitorMac = new Monitor("Mac", 13);//IMPORTAR CLASE
        Teclado tecladoMac = new Teclado("Bluetooth", "Mac");
        Raton ratonMac = new Raton("Bluetooth", "Mac");
        Computadora computadoraMac = new Computadora("Computadora Mac", monitorMac, tecladoMac, ratonMac);
        
        
        //Creamos otros objetos para la orden #2
        Monitor monitorSamsung = new Monitor("Samsung", 24);
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        Orden orden1 = new Orden();//Iniciamos el arreglo vacio
        Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraACER);
        orden1.agregarComputadora(computadoraMSI);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraMac);
        Computadora computadorasVarias = new Computadora("Computadora de otra marca", monitorSamsung, tecladoHP, ratonSamsung);
        
        orden2.agregarComputadora(computadorasVarias);
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
    }
}
