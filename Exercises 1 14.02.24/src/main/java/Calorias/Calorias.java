package Calorias;

public class Calorias {
    public static void main(String[] args) {
        Integer minutosAquecimento = 15;
        Integer minutosAerobicos = 25;
        Integer minutosMusculacao = 40;
        Integer minutosTotal = minutosAquecimento + minutosAerobicos + minutosMusculacao;

        Integer calorias = 0;

        if (!minutosTotal.equals(0)) {
            if (minutosAquecimento > 0){
                calorias += minutosAquecimento * 12;
            }
            if (minutosAerobicos > 0) {
                calorias += minutosAerobicos * 20;
            }
            if (minutosMusculacao > 0) {
                calorias += minutosMusculacao * 25;
            }
        }
        System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.",
                minutosTotal, calorias);
    }
}
