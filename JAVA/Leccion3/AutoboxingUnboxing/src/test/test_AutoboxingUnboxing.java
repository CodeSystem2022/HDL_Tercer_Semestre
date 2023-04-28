package test;

public class test_AutoboxingUnboxing {
    public static void main(String[] args) {
        // Clase envolvetnes o Wrapper
        // Al declarar las variables:
        int enteroPrim = 4; // Tipo primivito
        System.out.println("Tipo primitivo: "+ enteroPrim);
        Integer entero = 76;// Tipo object
        System.out.println("Tipo object = " + entero.doubleValue()); // Autoboxing
        
        // Uboxing 
        int entero2 = entero;
        System.out.println("entero2 = " + entero2); // Lo convertimos en Tipo primitivo
        
        /*
        CLASES ENVOLVETES DE TIPOS PRIMITIVOS
        int = la clase envolvente es Integer
        long = la clase envolvente es Long
        float = la clase envolvente es Float
        double = la clase envolvente es Double
        boolean = la clase envolvente es Boolean
        byte = la clase envolvente es Byte
        char = la clase envolvente es Character
        short = la clase envolvente es Short
        */
    }
    
}