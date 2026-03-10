package estruturas_de_controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        double nota = 0;
        double total = 0;
        int notasValidas = 0;

        while (nota != -1) {
            System.out.print(contador + "º número: ");
            nota = sc.nextDouble();
            if (nota >=0 && nota <= 10) {
                total += nota;
                notasValidas++;
            }
            contador++;
        }

        double media = total / notasValidas;

        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}
