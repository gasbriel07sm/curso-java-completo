package estruturas_de_controle.exercicios;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        // 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int num = 0;

        while (num >= 0) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num >= 0) {
                soma += num;
            }
        }

        System.out.println("A soma dos elementos digitados é igual a: " + soma);

        sc.close();
    }
}
