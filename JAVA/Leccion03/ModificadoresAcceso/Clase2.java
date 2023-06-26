package Leccion03.ModificadoresAcceso;

class Clase2 extends Clase1  {
    String atributoDefaulf = "Valor del atributo defaulf";

    //Clase2(){
     //   System.out.println("Constructor Default");
    //}

    public Clase2(){
        super();
        this.atributoDefaulf = "Modificacion del atributo defaulf";
        System.out.println("atributo defaulf = " + this.atributoDefaulf);
        this.metodoDefaulf();
    } 

    void metodoDefaulf(){
        System.out.println("Metodo defaulf");
    }

}
