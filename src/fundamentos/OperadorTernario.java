package fundamentos;

public class OperadorTernario {
    public static void main(String[] args) {

        /**
         * Operador Ternário:
         * <condição> ? <verdadeiro> : <falso>
         * Executa o bloco verdadeiro caso a condição seja verdadeira, e o falso caso a condição seja falsa
         */

        double media = 7.6;
        // String resultadoRecuperacao = media >= 5 ? "Em recuperação" : "Reprovado";
        // String resultado = media >= 7 ? "Aprovado" : resultadoRecuperacao;
        String resultado = media >= 7 ? "Aprovado" : "Recuperação";

        System.out.println("O aluno está " + resultado);
    }
}
