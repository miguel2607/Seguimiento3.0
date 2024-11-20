package function;

import java.util.function.Function;

public class ejemplo1 {

private String nombre;
private String equipo;
private String Contraseña;

    public ejemplo1(String nombre, String equipo, String contraseña) {
        this.nombre = nombre;
        this.equipo = equipo;
        Contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public static void main(String[] args) {

        ejemplo1 ejemplo1 = new ejemplo1("MIGUEL ANGEL RODRIGUEZ ARANZAZU","REAL MADRID","UCDLEFBAKS");

        Function<ejemplo1,String> conversion = str -> str.getNombre().toLowerCase();
        Function<ejemplo1,String>conversion2 = str -> str.getEquipo().toLowerCase();
        System.out.println(conversion.apply(ejemplo1) + "...." + conversion2.apply(ejemplo1));
    }
}
