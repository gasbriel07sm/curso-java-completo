package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        // IMC = peso / (altura)²
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("O IMC é: %.2f%n", imc);

        sc.close();
    }
}
