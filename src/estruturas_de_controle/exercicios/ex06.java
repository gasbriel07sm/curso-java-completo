package estruturas_de_controle.exercicios;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        // 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
        Scanner sc = new Scanner(System.in);
        int numAleatorio = 80;
        int tentativas = 10;

        while (tentativas > 0) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num > numAleatorio) {
                System.out.println("O número é menor...");
            } else if (num < numAleatorio) {
                System.out.println("O número é maior...");
            } else {
                System.out.println("Parabéns, você encontrou!");
                System.out.println("Total de tentativas: " + (10 - tentativas));
                break;
            }
            tentativas--;
            System.out.println("Tentativas restantes: " + tentativas);
        }

        sc.close();
    }
}
