package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
        // F = (C * 9/5) + 32
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * (5/9.0);

        System.out.printf("%.2fºF equivale a %.2fºC %n", f, c);

        sc.close();
    }
}
