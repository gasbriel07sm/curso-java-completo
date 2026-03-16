package arrays_e_collections.arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int qtdAlunos = sc.nextInt();

        System.out.print("Digite a quantidade de notas que cada aluno tem: ");
        int qtdNotas = sc.nextInt();

        double[][] notas = new double[qtdAlunos][qtdNotas];
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("Aluno [%d], Nota [%d]: ", i+1, j+1);
                notas[i][j] = sc.nextDouble();
                total += notas[i][j];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.printf("A média da turma é igual a: %.2f%n", media);

        // forma de visualizar em formato de matriz (utilizando for)
//        for (int i = 0; i < notas.length; i++) {
//            for (int j = 0; j < notas[i].length; j++) {
//                System.out.print(notas[i][j] + " ");
//            }
//            System.out.println();
//        }

        // outra forma de visualizar de forma mais simplificada e eficaz
        for (double[] i: notas) {
            System.out.println(Arrays.toString(i));
        }


        sc.close();
    }
}
