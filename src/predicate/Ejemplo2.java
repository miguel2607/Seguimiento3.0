package predicate;

import java.util.function.Predicate;

public class Ejemplo2 {
    public static void main(String[] args) {

        Predicate<Double> IsMasGrande = m -> m > 9.33;

        boolean EsMasGrande = IsMasGrande.test(9.333);
        System.out.println(EsMasGrande); // false


        boolean EsMasBajo = IsMasGrande.test(1.00);
        System.out.println(EsMasBajo);
    }
}
