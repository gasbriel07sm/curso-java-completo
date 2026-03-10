package estruturas_de_controle;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaIfElseIf {
    public static void main(String[] args) {
        /**
         * Com if e else aninhados podemos fazer:
         * if (condição 1) {
         *    <comandos 1>
         * } else if (condição 2) {
         *    <comandos 2>
         * } else {
         *    <comandos 3>
         * }
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota >= 4.1) {
        System.out.println("Conceito C");
        } else if (nota >= 2.1) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }


        sc.close();
    }
}
