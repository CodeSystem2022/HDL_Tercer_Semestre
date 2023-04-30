package paquete1;

class Clase2 { // Clase Default o package, no puede utilizarse en otro paquete
    String atributoDefault = "Valor atributo defaul";
    
    Clase2(){
        System.out.println("Constructor default");
    }
    
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
    
}
