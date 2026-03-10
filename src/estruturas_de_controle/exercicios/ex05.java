package estruturas_de_controle.exercicios;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        // 5. Refatorar o exercício 04, utilizando a estrutura switch.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int totalDivisores = 0;
        for (int i = 2; i <= num ; i++) {
            if (num % i == 0) {
                totalDivisores++;
            }
        }

        switch (totalDivisores) {
            case 1:
                System.out.println("É primo");
                break;
            case 0:
                System.out.println("Inexistente");
                break;
            default:
                System.out.println("Não é primo");
                break;
        }

        sc.close();
    }
}
