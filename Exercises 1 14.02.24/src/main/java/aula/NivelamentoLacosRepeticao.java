package aula;

import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoLacosRepeticao {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println("Valor de i: " + i);
        }
        for (int i = 10; i >= 0; i--){
            System.out.println("Valor de i: " + i);
        }

        // While é utilizado quando não se sabe a condição de parada
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,10);
        int contador = 1;
        while(numeroSorteado != 0){
            System.out.println("Tentativa N° " + contador);
            System.out.println("Número sorteado: " + numeroSorteado);
            numeroSorteado =  ThreadLocalRandom.current().nextInt(0,10);
            contador++;
        }

        // O "Do While" faz uma vez e verifica se o que foi feito é verdade. Ele faz e depois executa.
        Integer numeroSorteadoDois;
        do {
            numeroSorteadoDois = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(numeroSorteadoDois);
        } while (numeroSorteadoDois != 0);
    }
}
