package aula;

import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoCondicionais {
    public static void main(String[] args) {
        Integer numero01 = 9;
        Integer numero02 = 27;
        String numero03 = "5";

        if (numero01 > numero02) {
            System.out.println("Variável numero01 é maior do que numero02");
        } else if (numero01.equals(numero02)) {
            System.out.println("As variáveis possuem valores iguais");
        } else {
            System.out.println("Variável numero02 é maior do que numero01");
        }
        String nome01 = "William";
        String nome02 = "William";

        // Ao utilizar "==" Se as strings forem iguais ele dará que é igual, pois está utilizando o mesmo endereço
        // De memória fixado na variável. É um falso positivo.
        if (nome01.equals(nome02)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
        System.out.println(nome01.length());

        Boolean booleano = numero01 != numero02; // Isso retornará verdadeiro ou falso, afinal é um Boolean.
        Boolean booleanoIgualMasDiferente = !numero01.equals(numero02); // Jeito diferente, mas igual, mas diferente.
        if (booleano){ // A própria variável já retornara se é true or false, ela carrega já a condição.
            System.out.println("É verdade");
        } else {
            System.out.println("É falso");
        }

        Integer numeroRandomico = ThreadLocalRandom.current().nextInt(5,2 ); // Se colocar só o bound, ele inicia-
        //- rá do 0
        Double numeroRandomicoDouble = ThreadLocalRandom.current().nextDouble(0.88); // Random só que Double
        System.out.println(numeroRandomico);
        System.out.println(numeroRandomicoDouble);

        // Random randomico = new Random(); // Jeito menos performático
        // Integer numRand = randomico.nextInt(1,3); // Jeito menos performático

        ThreadLocalRandom randomico = ThreadLocalRandom.current();

        Integer numRand = randomico.nextInt(-1 -15);
        System.out.println(randomico);

    }
}
