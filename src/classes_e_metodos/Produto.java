package classes_e_metodos;

public class Produto {
    // definindo três atributos dentro da classe
    String nome;
    double preco;
    double desconto;

    // construtor padrão
    Produto() {}

    // criando um construtor
    Produto (String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto () {
        return preco * (1 - desconto);
    }

    // criando um método com desconto de gerente se passar algum parâmetro
    double precoComDesconto (double descontoGerente) {
        return preco * (1 - (desconto + descontoGerente));
    }
}
