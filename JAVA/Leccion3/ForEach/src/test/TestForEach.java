package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args){
        int edades[]= {5,9,8,6};
        for(int edad: edades){ // Asi utilizamos el ciclo forEach
            System.out.println("edad = " + edad);
        }
        
        Persona personas[]= {new Persona("Juan"), new Persona("Santiago"), new Persona("Jorge")};
        // ForEach
        for(Persona persona: personas){
            System.out.println("persona=  " + persona);
        }
    }
    
    
}
