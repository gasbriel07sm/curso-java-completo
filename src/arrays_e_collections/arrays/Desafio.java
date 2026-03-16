package arrays_e_collections.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // calcular a média das notas de alunos com Scanner utilizando dois for (um for e um foreach) - resultar a média
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas notas deseja digitar: ");
        int n = sc.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {
            System.out.print(i + 1 + "º nota: ");
            notas[i] = sc.nextDouble();
        }

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.printf("A média das notas é igual a: %.2f%n", media);

        sc.close();
    }
}
