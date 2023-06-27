package test;

import enamuraciones.Continentes;
import enamuraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: "+Dias.LUNES);
        indicarDiasSemana(Dias.LUNES);
        System.out.println("Continente No. 4: "+Continentes.AMERICA);
        System.out.println("No. de habitantes en el 1er. continente: "+Continentes.AFRICA.getHabitantes());
        System.out.println("No. de habitantes en el 2do contiente: "+Continentes.EUROPA.getHabitantes());
        System.out.println("No. de habitantes en el 3er contiente: "+Continentes.ASIA.getHabitantes());
        System.out.println("No. de habitantes en el 4to contiente: "+Continentes.AMERICA.getHabitantes());
        System.out.println("No. de habitantes en el 5to contiente: "+Continentes.OCEANIA.getHabitantes());

    }
    
    private static void indicarDiasSemana(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
            case VIERNES:
                System.out.println("Quinto dia de la semana");
            case SABADO:
                System.out.println("Sexto dia de la semana");
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
            default:
                throw new AssertionError();
        }
    }
}

//Completamos tarea indicada por el profesor
//Agregar los demas dias y el default