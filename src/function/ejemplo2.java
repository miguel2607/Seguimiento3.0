package function;

import java.util.function.Function;

public class ejemplo2 {


    private Integer numeroModelo;
    private String Objeto;
    private String uso;

    public ejemplo2(Integer numeroModelo, String objeto, String uso) {
        this.numeroModelo = numeroModelo;
        Objeto = objeto;
        this.uso = uso;
    }

    public int getNumeroModelo() {
        return numeroModelo;
    }

    public void setNumeroModelo(Integer numeroModelo) {
        this.numeroModelo = numeroModelo;
    }

    public String getObjeto() {
        return Objeto;
    }

    public void setObjeto(String objeto) {
        Objeto = objeto;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public static void main(String[] args) {

        ejemplo2 ejemplo2 = new ejemplo2(2255,"Celular","LLAMADAS");
        Function<ejemplo2,String>conversionLetra = convertir -> convertir.getObjeto().toUpperCase();
        Function<ejemplo2,Integer> conversionNumero = convertirnum -> convertirnum.getNumeroModelo() + 2247;
        Function<ejemplo2,String>conversion = conversionn -> conversionn.getUso().toLowerCase();


        System.out.println("El objeto es un " + conversionLetra.apply(ejemplo2) + " con el numero de modelo " + conversionNumero.apply(ejemplo2) + " y su uso es para: " + conversion.apply(ejemplo2));

    }
}
