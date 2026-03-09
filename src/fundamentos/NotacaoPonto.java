package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";

        System.out.println(s.toUpperCase()); // coloca em letras maiúsculas, não altera o valor original, somente neste comando
        System.out.println(s.toLowerCase()); // coloca em letras minúsculas, não altera o valor original, somente neste comando

        System.out.println(s.replace("X", "Senhora")); // o replace serve para trocar o primeiro parâmetro pelo segundo, caso o primeiro exista na variável

        System.out.println(s.concat("!!!")); // serve para concatenar a string com o valor passado por parâmetro

        // a notação ponto serve para acessar alguma funcionalidade / método

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // tipos primitivos não posuem o operador / notação ponto
    }
}
