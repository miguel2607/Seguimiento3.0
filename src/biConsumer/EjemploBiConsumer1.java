package biConsumer;

import java.util.function.BiConsumer;

public class EjemploBiConsumer1 {
    public static void main(String[] args) {
        BiConsumer<String, String> mostrar = (nombre, residencia) ->
                System.out.println(nombre + " Recide en " + residencia );
        mostrar.accept("miguel", "Calle 24 norte");
        mostrar.accept("mbappe", "Madrid calle 15 ");
    }
}
