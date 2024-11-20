package supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)    ;

        Supplier<Integer> NumeroAleatorio = () -> (int) (Math.random() * 100);
            int NuevoNumero = NumeroAleatorio.get();
        System.out.println("Adivine el numero: ");
            int numeroUsuario = scanner.nextInt();

        if (numeroUsuario == NuevoNumero){
            System.out.println("Acertaste");
        }else {
            System.out.println("El número era " + NuevoNumero);
        }


        }
    }

