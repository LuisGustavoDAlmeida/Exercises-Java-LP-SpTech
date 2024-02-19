package Sorteio;

import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer numEscolhido = 77;
        Integer numAleatorio;
        Integer numPar = 0;
        Integer numImpar = 0;
        for (int i = 0; i < 200; i++) {
            numAleatorio = ThreadLocalRandom.current().nextInt(1,101);
            if (numAleatorio == numEscolhido) {
                System.out.println(" O n° " + numEscolhido + ". Foi sorteado na posição: " + i );
                break;
            } else if (numAleatorio % 2 == 0){
                numPar++;
            } else {
                numImpar++;
            }
        }
        System.out.println("A quantidade de números ímpares foi: " + numImpar);
        System.out.println("A quantidade de números pares foi: " + numPar);
    }
}
