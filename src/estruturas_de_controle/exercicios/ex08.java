package estruturas_de_controle.exercicios;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        // 8. Crie um programa que recebe 10 valores e ao final imprima o maior número.
        Scanner sc = new Scanner(System.in);

        int maior = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + "º número: ");
            int num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

        sc.close();
    }
}
