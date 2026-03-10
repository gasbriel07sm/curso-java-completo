package estruturas_de_controle.exercicios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 10) {
            System.out.println("O número está entre 0 e 10");

            if (num % 2 == 0){
                System.out.println("O número é par");
            } else {
                System.out.println("O número é ímpar");
            }
        }

        sc.close();
    }
}
