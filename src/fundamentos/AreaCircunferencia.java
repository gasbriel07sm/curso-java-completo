package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        // variáveis -> armazenar dados
        // <tipo> <identificador> = <valor>;
        // <tipo> <identificador>;

        int raio = 3; // números inteiros, sem casas decimais
        double raio2 = 3.4; // números reais, com casas decimais
        final double PI = Math.PI; // PI é uma constante (declarada pelo final), não é possível alterá-la

        double areaCirc = PI * Math.pow(raio2, 2);
        System.out.printf("A area do círculo com raio %.2f é: %.2f%n", areaCirc); // printf() é um print formatado
        // %f -> double
        // %d -> inteiro
        // %s -> string
        // %n -> quebra de linha (new line)
    }
}
