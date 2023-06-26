package Leccion03.ForEach;

public class persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "persona [nombre=" + nombre + "]";
    }

}
