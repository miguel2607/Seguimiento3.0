package consumer;

public class productos {

    private String nombres;
    private String codigo;

    public productos(String nombres, String codigo) {
        this.nombres = nombres;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
