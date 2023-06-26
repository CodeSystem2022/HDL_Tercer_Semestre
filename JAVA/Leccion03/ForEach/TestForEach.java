package Leccion03.ForEach;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = { 5, 6, 8, 9 }; // Sintexis resumida
        for (int edad : edades) { // Sintexis del foreach
            System.out.println("Edad = " + edad);
        }

        persona personas[] = { new persona("Juan"), new persona("Carla"), new persona("Franco") };

        // For each
        for (persona persona : personas) {
            System.out.println("personas = " + persona);
        }

    }
}
