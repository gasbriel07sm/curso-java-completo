package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        // automaticamente será retornado se emitir as chaves, mostrando que há somente uma linha

        Calculo calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.executar(2, 3));

        calculo = (x, y) -> x * y;
        System.out.println(calculo.executar(2, 3));

    }
}
