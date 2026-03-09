package fundamentos;

public class DesafioVariaveisEConstantes {
    public static void main(String[] args) {
        // (ºF - 32) X 5 / 9 = ºC
        final double a = 5 / 9.0;
        final double b = 32;
        double fahr = 50;
        double celsius = (fahr - b) * a;

        System.out.printf("O valor de ºC é igual a: %.2f%n", celsius);
     }
}
