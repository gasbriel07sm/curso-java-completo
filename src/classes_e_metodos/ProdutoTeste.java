package classes_e_metodos;

import java.util.Locale;

public class ProdutoTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto p1 = new Produto("Notebook", 4356.89, 0.25); // instanciando um objeto com o construtor

        Produto p2 = new Produto(); // instanciando outro objeto do tipo Produto com o nome p2
        // podemos declarar as variáveis de tipo de algum objeto com var também, ficando = var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        // chamando com (), significa que estamos chamando um método, porém ao chamar apenas com . será um atributo
        double precoFinal1 = p1.precoComDesconto(); // chamando o método que calcula com desconto
        double precoFinal2 = p2.precoComDesconto(0.1); // chamando método que calcula com desconto de gerente

        System.out.println("Produto 1:");
        System.out.printf("NOME: %s %nPREÇO: R$ %.2f %nDESCONTO: %.2f %%%n", p1.nome, p1.preco, p1.desconto);
        System.out.printf("PREÇO FINAL PRODUTO 1: R$ %.2f%n", precoFinal1);
        System.out.println(p1); // mostra o endereço onde está armazenado este objeto

        System.out.println("\nProduto 2:");
        System.out.printf("NOME: %s %nPREÇO: R$ %.2f %nDESCONTO: %.2f %%%n", p2.nome, p2.preco, p2.desconto);
        System.out.printf("PREÇO FINAL PRODUTO 2: R$ %.2f%n", precoFinal2);
        System.out.println(p2);

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2.0;
        System.out.printf("\nMÉDIA DO CARRINHO = R$ %.2f", mediaCarrinho);

    }
}
