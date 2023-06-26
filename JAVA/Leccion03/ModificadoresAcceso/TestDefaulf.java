package Leccion03.ModificadoresAcceso;

public class TestDefaulf {
    public static void main(String[] args) {
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.atributoDefaulf = "Cambio desde la prueba";
        System.out.println("claseH2 atributo defaul = "+claseH2.atributoDefaulf);

        Clase4 clase4 = new Clase4("Publico");
        System.out.println(clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("Cambio");
        System.out.println("clase4 = "+clase4.getAtributoPrivate());

    }
}
