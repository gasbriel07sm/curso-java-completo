package estruturas_de_controle.exercicios;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // 2. Criar um programa informa se o ano atual é um ano bissexto;
        // determina que anos divisíveis por 4 são bissextos (366 dias), exceto anos múltiplos de 100 que não são divisíveis por 400
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && (ano % 100 == 0 && ano % 400 == 0)) {
            System.out.printf("O ano %d é bissexto", ano);
        } else {
            System.out.printf("O ano %d não é bissexto", ano);
        }

        sc.close();
    }
}
