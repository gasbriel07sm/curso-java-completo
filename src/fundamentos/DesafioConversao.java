package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Digite o segundo valor: ");
        double num2 = Double.parseDouble(sc.nextLine());

        System.out.print("Digite o terceiro valor: ");
        double num3 = Double.parseDouble(sc.nextLine());

        double media = (num1 + num2 + num3) / 3.0;

        System.out.printf("A média é igual a: %.2f%n", media);

        sc.close();
    }
}
