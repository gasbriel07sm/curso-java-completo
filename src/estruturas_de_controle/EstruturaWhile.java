package estruturas_de_controle;

public class EstruturaWhile {
    public static void main(String[] args) {
        /**
         * A estrutura while permite a repetição de código enquanto uma condição for verdadeira
         * Sintaxe:
         * while (condição) {
         *   <comando>
         * }
         */
        int contador = 1;

        while (contador <= 10) {
            System.out.printf("i = %d\n", contador);
            contador++;
        }
    }
}
