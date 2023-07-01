package Leccion12;

public class Main {
    public static void main(String[] args) {
        var conexion = Conexion.getConnection();
        if (conexion != null)
            System.out.println("Conexion exitosa: " + conexion);
        else
            System.out.println("Error al conextarse");
    }
}
