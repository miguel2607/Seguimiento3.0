package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ejemplo1 {

    public static void main(String[] args) {

        List<productos > productosList = new ArrayList<>();

        productosList.add(new productos("Manzana","DCREWGRT3"));
productosList.add(new productos("Uva" , "JCXBHDB4"));

productosList.add(new productos("Cereza","UCHBDJV5"));

productosList.add(new productos("Naranjas","BFCHBDNVC4"));

        Consumer<List<productos>> nuevo = (listaProductos) -> {
            for(productos productos : productosList) {
                System.out.println(productos.getNombres()+ " - codigo: " + productos.getCodigo());
            }
        };
        nuevo.accept(productosList);

    }

}
