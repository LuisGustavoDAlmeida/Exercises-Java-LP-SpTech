package NumerosImpares;

public class NumerosImpares {
    public static void main(String[] args) {
        for (int i = 0; i <= 90; i++) {
            int resto = i % 2;
            if (resto == 1){
                System.out.println(i);
            }
        }
    }
}
