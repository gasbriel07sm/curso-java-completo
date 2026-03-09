package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {
        // Ler num1, num2, operação (+,-,*,/,%)
        Scanner sc = new Scanner(System.in);

        System.out.print("NÚMERO 1: ");
        int num1 = sc.nextInt();
        System.out.print("NÚMERO 2: ");
        int num2 = sc.nextInt();
        System.out.print("OPERAÇÃO: ");
        String op = sc.next();

        // Lógica sem if

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : 0;
        resultado = "*".equals(op) ? num1 * num2 : 0;
        resultado = "/".equals(op) ? num1 / num2 : 0;
        resultado = "%".equals(op) ? num1 % num2 : 0;

        System.out.printf("%.2f %s %f = %.2f", num1, op, num2, resultado);

        sc.close();
    }
}
