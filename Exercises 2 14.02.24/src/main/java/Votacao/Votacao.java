package Votacao;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
        Integer numAleatorio;
        Integer saborMussarela = 0;
        Integer saborCalabresa = 0;
        Integer sabor4Queijos = 0;
        for (int i = 0; i < 10; i++) {
            numAleatorio = ThreadLocalRandom.current().nextInt(1, 4);
            if (numAleatorio.equals(1)) {
                saborMussarela++;
            } else if (numAleatorio.equals(2)) {
                saborCalabresa++;
            } else {
                sabor4Queijos++;
            }
        }
        System.out.println("Houveram " + saborMussarela + " Votos no sabor Mussarela");
        System.out.println("Houveram " + saborCalabresa + "Votos no sabor Calabresa");
        System.out.println("Houveram " + sabor4Queijos + "Votos no sabor 4 queijos");
        if (saborMussarela > saborCalabresa &&  saborMussarela > sabor4Queijos){
            System.out.println("O sabor Mussarela é o favorito");
        } else if (saborCalabresa > saborMussarela && saborCalabresa > sabor4Queijos) {
            System.out.println("O sabor Calabresa é o favorito");
        } else {
            System.out.println("O sabor 4 Queijos é o favorito");
        }
    }
}
