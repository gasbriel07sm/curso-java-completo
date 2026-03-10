package estruturas_de_controle;

import javax.swing.*;

public class EstruturaIfElse {
    public static void main(String[] args) {
        /**
         * A estrutura if/else serve para que a condição se for falsa, executar o bloco else, e se for verdadeira, o if
         * Sintaxe:
         * if (condicao) {
         *   <comandos>
         * } else {
         *   <comandos>
         * }
         */

        String valor = JOptionPane.showInputDialog("Informe um número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("Número par");
        }
        else {
            System.out.println("Número ímpar");
        }
    }
}
