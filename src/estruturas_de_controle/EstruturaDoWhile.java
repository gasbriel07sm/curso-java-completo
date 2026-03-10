package estruturas_de_controle;

import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        /**
         * A estrutura do while serve para executar uma condição pelo menos uma vez
         * do {
         *   <comandos>
         * } while (condição);
         */
        Scanner sc = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Você precisa falar as palavras máqicas");
            System.out.print("Quer sair? ");
            texto = sc.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");

        sc.close();
    }
}
