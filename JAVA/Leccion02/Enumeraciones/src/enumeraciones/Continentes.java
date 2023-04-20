
package enumeraciones;

public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "2 billones"),
    ASIA(44, "4 billones"),
    AMERICA(34, "5 billones"),
    OCEANIA(14, "6 billones");
    
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Metodo Get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
