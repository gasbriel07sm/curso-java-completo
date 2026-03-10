package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
        // F = (C * 9/5) + 32;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9/5.0) + 32;

        System.out.printf("%.2fºC equivalem a %.2fºF %n", c, f);

        sc.close();
    }
}
