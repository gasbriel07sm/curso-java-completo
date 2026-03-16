package arrays_e_collections.arrays;

import java.util.Arrays;
import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[] notasAlunoA = new double[3];
        // pode colocar o par de colchetes depois do nome também >> double notasAlunoA[]
        System.out.println(Arrays.toString(notasAlunoA)); // coloca os valores padrões dos tipos de arrays

        notasAlunoA[0] = 7.9; // declarando valores para cada array
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        // Arrays.toString(notasAlunoA); > serve para transformar um Array em uma String
        System.out.println(Arrays.toString(notasAlunoA));

        // acessando notas
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]); // pegar o último elemento do array
        // System.out.println(notasAlunoA[10]); // como esse índice não existe, no Java apresenta erro


        // percorrer o Array (tipo 1 ->> for)
        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println("\nALUNO A:");
        System.out.printf("O total das notas é igual: %.2f%n", totalAlunoA);

        double mediaAlunoA = totalAlunoA / notasAlunoA.length; // serve para pegar a quantidade de elementos presentes dentro do array
        System.out.printf("A média das notas é igual a: %.2f%n", mediaAlunoA);

        // outra forma de inicializar um array
        double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println("\nALUNO B:");
        System.out.printf("O total das notas é igual: %.2f%n", totalAlunoB);

        double mediaAlunoB = totalAlunoB / notasAlunoB.length; // serve para pegar a quantidade de elementos presentes dentro do array
        System.out.printf("A média das notas é igual a: %.2f%n", mediaAlunoB);
    }
}
