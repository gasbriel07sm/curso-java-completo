package fundamentos;

import javax.swing.*;
import java.util.Date; // o import serve para puxar novas funcionalidades

public class Imports {
    public static void main(String[] args) {
        java.lang.String b = "Boa tarde"; // -> puxando o caminho completo
        // java.lang (pacote básico e já está puxando tudo)
        java.lang.System.out.println(b);

        String s = "Bom dia!";
        System.out.println(s);

        Date d = new Date();
        System.out.println(d);

        // JButton botao = new JButton();
    }
}
