package biConsumer;

public class RealMadrid {

private String nombre;
private String entradaLiga;


    public RealMadrid(String nombre, String entradaLiga) {
        this.nombre = nombre;
        this.entradaLiga = entradaLiga;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntradaLiga() {
        return entradaLiga;
    }

    public void setEntradaLiga(String entradaLiga) {
        this.entradaLiga = entradaLiga;
    }
}
