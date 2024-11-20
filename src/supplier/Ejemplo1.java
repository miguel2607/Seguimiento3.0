package supplier;

import java.util.function.Supplier;

    public class Ejemplo1<M> {
        private M object;
        public Ejemplo1(M object) {
            this.object = object;
        }
        public M getObject() {
            return object;
        }
        public void setObject(M object) {
            this.object = object;
        }
        public static void main(String[] args) {
            Ejemplo1<Double> ejemplo1 = new Ejemplo1<>(3.95898);
            Supplier<Ejemplo1<Double>> supplierString = () -> ejemplo1;
            Ejemplo1<String> ejemplo11 = new Ejemplo1<>("Miguel Rodriguez");
            Supplier<Ejemplo1<String>> supplierInteger = () -> ejemplo11;
            System.out.println(supplierString.get().getObject());
            System.out.println(supplierInteger.get().getObject());
        }
    }






