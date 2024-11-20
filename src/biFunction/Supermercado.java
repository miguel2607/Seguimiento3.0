package biFunction;

public class Supermercado {

    private String producto;
private String codigo;

    public Supermercado(String producto,String codigo) {
        this.producto = producto;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
