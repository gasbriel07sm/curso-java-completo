package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        // interface Function

        Function<Integer, String> parOuImpar =
                num -> num % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(33)); // retorna ímpar
        System.out.println(parOuImpar.apply(32)); // retorna par

        Function<String, String> oResultadoE =
                valor -> "O resultado é " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        Function<String, String> duvida =
                valor -> valor + "???";

        String resultadoFinal =
                parOuImpar
                        .andThen(oResultadoE)
                        .andThen(empolgado)
                        .apply(32);

        // a função .andThen() é "e então", chama outra função
        // o rsultado da função apply() é passado para a primeira função, neste caso parOuImpar
        // quanto maior a função, menor a forma de reutilizar
        System.out.println(resultadoFinal);

        String resultadoFinal2 =
                parOuImpar
                        .andThen(oResultadoE)
                        .andThen(duvida)
                        .apply(32);

        System.out.println(resultadoFinal2);
    }
}
