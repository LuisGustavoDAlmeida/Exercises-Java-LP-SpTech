package CalculoDeTroco;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Integer valorProduto = 5;
        Integer qtdVendida = 10;
        Double valorPago = 57.90;

        Integer valorTotal = qtdVendida * valorProduto;

        Double troco = valorPago - valorTotal;

        System.out.println("Seu troco será de R$" + troco);
    }
}
