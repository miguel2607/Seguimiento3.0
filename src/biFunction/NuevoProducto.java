package biFunction;

public class NuevoProducto {

    private  String producto;

    private String codigo;

    public NuevoProducto(String producto, String codigo) {
        this.producto = producto;
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
