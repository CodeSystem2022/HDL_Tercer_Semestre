package Leccion05.ConversionObjetos;

public enum TipoEscritura {
    CLASICO ("Escritura a mano"),
    MODERNO ("Escritura digiral");

    private final String descripcion;
    
    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodo get
    public String getDescripcion() {
        return this.descripcion;
    }
}
