package orientacao_a_objetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> item = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        this.item.add(new Item(quantidade, produto));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco);
        this.item.add(new Item(quantidade, produto));
    }

    double obterValorTotal() {
        double total = 0;

        for (Item i: item) {
            total += (i.quantidade * i.produto.preco);
        }

        return total;
    }
}
