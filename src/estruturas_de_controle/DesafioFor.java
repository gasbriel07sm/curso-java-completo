package estruturas_de_controle;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(valor);
            valor += "#";
        }

        // Versão do desafio:
        // Não pode usar valor numérico apra controlar o laço

        valor = "#";
        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
