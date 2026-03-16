package orientacao_a_objetos.composicao;

import java.util.ArrayList;

public class Compra {
    // Relacionamento UM para MUITOS
    // uma compra tem muitos itens

    String cliente;
    ArrayList<Item> itens = new ArrayList<>(); // relação 1:n

    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    double obterValorTotal() {
        double total = 0;
        for (Item i: itens) {
            total += (i.preco * i.quantidade);
        }
        return total;
    }
}
