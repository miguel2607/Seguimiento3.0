package consumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ejemplo2 {
    public static void main(String[] args) {


        List<productos> productos = new ArrayList<>();

        productos.add(new productos("Manzana","DSVT7"));
        productos.add(new productos("Naranja","FREH500"));
        productos.add(new productos("Uva","CDWVS5"));
        Consumer<List<productos>> productosConsumer = lista -> {
            Collections.reverse(lista);
            lista.forEach(System.out::println);
        };
productosConsumer.accept(productos);

    }
}
