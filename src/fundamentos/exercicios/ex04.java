package fundamentos.exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Quadrado = " + Math.pow(num, 2));
        System.out.println("Cubo = " + Math.pow(num, 3));

        sc.close();
    }
}
