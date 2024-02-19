package Acumulador;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer numAleatorio;
        Integer soma = 0;
       do {
            numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
           System.out.println("Número sorteado: " + numAleatorio);
            soma += numAleatorio;
       } while (!numAleatorio.equals(0));

        System.out.println("A soma dos números é " + soma);
    }
}
