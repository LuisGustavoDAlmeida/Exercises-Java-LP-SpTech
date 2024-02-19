package CalculoDeRenda;

public class CalculoDeRenda {
    public static void main(String[] args) {
        Integer qtdFilhos0a3Anos = 3;
        Integer qtdFilhos4a16Anos = 2;
        Integer qtdFilhos17a18Anos = 1;
        Integer qtdFilhosTotal = qtdFilhos0a3Anos + qtdFilhos4a16Anos + qtdFilhos17a18Anos;

        Double valorBolsa = 0.0;
        if (qtdFilhosTotal > 0) {
            if (qtdFilhos0a3Anos > 0) {
                valorBolsa += 25.12 * qtdFilhos0a3Anos;
            }
            if (qtdFilhos4a16Anos > 0) {
                valorBolsa += 15.88 * qtdFilhos4a16Anos;
            }
            if (qtdFilhos17a18Anos > 0) {
                valorBolsa += 12.44 * qtdFilhos17a18Anos;
            }
        }
        System.out.println("Você tem um total de " + qtdFilhosTotal + " filhos e vai receber R$"
                + valorBolsa + " de bolsa");
    }
}
