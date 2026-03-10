package estruturas_de_controle;

import java.util.Scanner;

public class EstruturaFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        for (int i = num; i >= 0 ; i -= 2) {
            System.out.print(i + " ");
        }
    }
}
