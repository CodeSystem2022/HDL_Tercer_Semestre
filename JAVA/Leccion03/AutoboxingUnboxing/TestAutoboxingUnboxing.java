package Leccion03.AutoboxingUnboxing;



public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
         * Clases envolventes de tipo primitivos
         * int = la clase envolvente es Integer
         * long = la clase envolvente es Long
         * float = la clase envolvente es Float
         * double = la clase envolvente es Double 
         * boolean = la clase envolvente es boolean
         * byte = la clase envolvente es byte
         * char = la clase envolvente es char
         * short = la clase envolvente es short
         */
        int enteroPrim = 10; //Tipo primitivo
        System.out.println("enteroPrim: " + enteroPrim);
        Integer entero = 10; //Tipo object con la clase integer
        System.out.println("entero: " + entero.doubleValue()); //Autoboxing

        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2); 
    }
}
