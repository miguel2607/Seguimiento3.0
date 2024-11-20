package biFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class ejemplo1 {
    public static void main(String[] args) {

    Supermercado supermercado = new Supermercado("Manzana","5151");

    NuevoProducto nuevoProducto = new NuevoProducto("Uva","fr5ew60");


        BiFunction<Supermercado, NuevoProducto, String> asignaCodigo = (supermercado1, nuevoProducto1) -> {
            supermercado1.setCodigo("JBFJV");
            return supermercado1.getProducto() + " Tiene el codigo: " + supermercado1.getCodigo() + " y " + nuevoProducto1.getProducto() + " tiene el codigo " + nuevoProducto1.getCodigo();
        };

        System.out.println(asignaCodigo.apply(supermercado,nuevoProducto));






    }
}
