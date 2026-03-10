package estruturas_de_controle;

import java.util.Scanner;

public class EstruturaIf {
    public static void main(String[] args) {
        /**
         * Estrutura if é uma forma de avaliar uma condição e executar algo usando essa condição como base
         * Sintaxe:
         * if (condição) {
         *   <comandos>
         * }
         * A lista de comandos só será executado se a condição for verdadeira, senão sai para fora
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = sc.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado");
        }

        if (media < 7 && media >= 4.5) {
            System.out.println("Recuperação");
        }

        boolean criterioReprovacao = media < 4.5 && media >=0;
        if (criterioReprovacao) {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
