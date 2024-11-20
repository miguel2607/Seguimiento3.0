package biFunction;

public class LigaCampeones {
    private String nombre;
    private String equipo1;
    private String equipo2;
    private String equipo3;

    public LigaCampeones(String nombre, String equipo2, String equipo1, String equipo3) {
        this.nombre = nombre;
        this.equipo2 = equipo2;
        this.equipo1 = equipo1;
        this.equipo3 = equipo3;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getEquipo3() {
        return equipo3;
    }

    public void setEquipo3(String equipo3) {
        this.equipo3 = equipo3;
    }
}
