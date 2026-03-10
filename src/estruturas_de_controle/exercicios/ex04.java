package estruturas_de_controle.exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        // 4. Criar um programa que receba um número e diga se ele é um número primo.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int totalDivisores = 0;
        for (int i = 2; i <= num ; i++) {
            if (num % i == 0) {
                totalDivisores++;
            }
        }

        System.out.println("Total de divisores: " + totalDivisores);

        if (totalDivisores == 1) {
            System.out.println("O número " + num + " é um número primo");
        } else {
            System.out.println("O número " + num + " não é primo");
        }

        sc.close();
    }
}
