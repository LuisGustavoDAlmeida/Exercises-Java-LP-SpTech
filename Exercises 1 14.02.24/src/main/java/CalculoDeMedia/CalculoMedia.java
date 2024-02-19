package CalculoDeMedia;

public class CalculoMedia {
    public static void main(String[] args) {
        String nome = "Matt";
        Double nota01 = 8.9;
        Double nota02 = 9.3;

        Double media = (nota01 + nota02) / 2;

        System.out.println("Olá, " + nome + ". Sua média foi de " + media);
    }
}
