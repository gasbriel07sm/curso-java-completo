package estruturas_de_controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // 3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        if (media >= 7.0 && media <= 10) {
            System.out.println("Aprovado");
        } else if (media < 7.0 && media >= 4.0) {
            System.out.println("Recuperação");
        } else if (media < 4.0 && media >= 0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Nota não disponível.");
        }

        sc.close();
    }
}
