package biConsumer;

import java.util.function.BiConsumer;

public class EjemploBiconsumer4 {
    public static void main(String[] args) {
        RealMadrid realMadrid = new RealMadrid("España", "26/10/2025" );

        // Creamos un objeto CiudadResidencia
        Ciudad ciudad = new Ciudad("Barcelona", "25/02/24" );

        // Actualizamos la ciudad de residencia del Empleado utilizando el BiConsumer
        BiConsumer<RealMadrid, Ciudad> biConsumer = (realMadrid1, ciudad1) -> realMadrid1.setNombre(ciudad1.getNombre());
        biConsumer.accept(realMadrid, ciudad);

        // Imprimimos los detalles del Empleado actualizados
        System.out.println("el club de futbol real madrid fue movido a la ciudad de: " + realMadrid.getNombre());
        System.out.println("La entrada a la nueva liga es el: " + realMadrid.getEntradaLiga());
    }
}
