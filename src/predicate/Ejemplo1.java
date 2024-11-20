package predicate;

import java.util.function.Predicate;

public class Ejemplo1 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Miguel Rodriguez ", true);
        Usuario usuario2 = new Usuario("Sofia Giraldo", false);

        Predicate<Usuario> estaEnLinea = Usuario::isActivo;

        System.out.println("El usuario de nombre " + usuario1.getNombre() + " esta conectado : "+ estaEnLinea.test(usuario1));
        System.out.println("El usuario de nombre  " + usuario2.getNombre() + " esta conectado : "+ estaEnLinea.test(usuario2));
    }
}
