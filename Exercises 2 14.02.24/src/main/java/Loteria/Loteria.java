package Loteria;

import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Integer numEscolhido = 7;
        Integer tentativas = 1;
        Integer numAleatorio;
        do {
            numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println("Tentiva N° " + tentativas);
            System.out.println(numAleatorio);
            tentativas++;
        } while (!numAleatorio.equals(numEscolhido));
        if (tentativas <= 3) {
            System.out.println("Vocé é MUITO sortudo");
        } else if (tentativas >= 4 && tentativas <= 10){
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
