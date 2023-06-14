package Leccion01.MundoPc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this(); // llamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + "]";
    }

}
