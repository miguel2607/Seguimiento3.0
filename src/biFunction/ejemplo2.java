package biFunction;

import java.util.function.BiFunction;

public class ejemplo2 {
    public static void main(String[] args) {
     LigaCampeones ligaCampeones = new LigaCampeones(" la Champions","Real madrid","Milan","Atletico de madrid");

        Sevilla sevilla = new Sevilla("Sevilla","liga española");


        BiFunction<LigaCampeones, Sevilla, String> asignarequipo = (ligaCampeones1, sevilla1) -> {
            sevilla1.setLiga("Liga de campeones");
            return ligaCampeones1.getNombre() + " ha asignado a el equipo " + sevilla1.getNombre()+ " a el grupo 1 con el " + ligaCampeones1.getEquipo2();
        };

        System.out.println(asignarequipo.apply(ligaCampeones,sevilla));
    }
}
