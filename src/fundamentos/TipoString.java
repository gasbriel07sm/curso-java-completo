package fundamentos;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(0)); // charAt(<x>) retorna a letra específica na posição x
        String s = "Boa tarde";
        // a String possui valor imutável, não é possível mudar o valor inicial

        // concatenar (com concat() e +)
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        // formatar maiusc. e minusc.
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // validações
        // startsWith() serve para verificar se uma String começa com o parâmetro passado
        // endsWith() é o contrário do startsWith(), serve para verificar se uma String finaliza com o parâmetro passado
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa")); // FALSE
        System.out.println(s.toLowerCase().startsWith("boa")); // TRUE
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));

        // verificar se é igual
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde")); // é o equals() porém sem considerar letras maiusc. e minusc.

        // verificar tamanho
        System.out.println(s.length()); // começa do 0 e conta espaços em branco ou vazio

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.printf("%nO senhor %s %s tem %d e ganha R$ %.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d e ganha R$ %.2f",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual")); // retorna se a String possui o parâmetro passado
        System.out.println("Frase qualquer".indexOf("qual")); // retorna em qual posição o parâmetro passado começa
        System.out.println("Frase qualquer".substring(6)); // neste caso irá me dar uma String a partir da posição em que foi passado o parâmetro
        System.out.println("Frase qualquer".substring(1, 6)); // neste caso irá me dar uma String a partir da posição em que foi passado o parâmetro, podemos colocar mais um parâmetro indicando onde deve terminar (não inclusivo)

    }
}
