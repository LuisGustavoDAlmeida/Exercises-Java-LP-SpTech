package Potencia;

public class Potencia {
    public static void main(String[] args) {
        Integer valorBase = 2;
        Integer valorExpoente = 5;
        Integer resultado = 1;
        for (int i = 0; i < valorExpoente; i++) {
            resultado *= valorBase;
        }
        System.out.println(resultado);
    }
}
