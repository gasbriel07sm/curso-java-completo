package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2.0;

        System.out.printf("A área do triângulo é: %.2f%n", area);

        sc.close();
    }
}
