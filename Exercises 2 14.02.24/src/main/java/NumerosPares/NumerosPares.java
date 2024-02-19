package NumerosPares;

public class NumerosPares {
    public static void main(String[] args) {
        Integer contador = 0;
        do {
            Integer resto = contador % 2;
            if (resto == 0){
                System.out.println(contador);
            }
            contador++;
        } while(contador <= 40);
    }
}
