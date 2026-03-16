package orientacao_a_objetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> item = new ArrayList<>();

    double obterValorTotal() {
        double total = 0;

        for (Item i: item) {
            total += (i.quantidade * i.produto.preco);
        }

        return total;
    }
}
