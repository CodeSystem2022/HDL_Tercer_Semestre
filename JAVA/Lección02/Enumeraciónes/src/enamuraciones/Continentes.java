package enamuraciones;

public enum Continentes {
    AFRICA(13, "1.2 billones"),
    EUROPA(13, "1.2 Billones"),
    ASIA(13, "1.7 Billones"),
    AMERICA(13, "1.2 Billones"),
    OCEANIA(13, "1.6 Billones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Método Get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
