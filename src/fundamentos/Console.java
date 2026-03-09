package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // pegar informações a partir do teclado

        System.out.println("Bom"); // quebra de linha após executar
        System.out.print("Dia!"); // sem quebra de linha
        System.out.printf("%n"); // print formatado

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("%s %s tem %d anos",
                nome, sobrenome, idade);

        sc.close();
    }
}
