package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        // Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.printf("Delta: %.2f%n", delta);
        System.out.printf("x': %.2f%n", x1);
        System.out.printf("x'': %.2f%n", x2);

        sc.close();
    }
}
