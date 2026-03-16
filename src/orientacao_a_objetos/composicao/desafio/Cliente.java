package orientacao_a_objetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nomeCliente;
    final List<Compra> compra = new ArrayList<>();

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    void adicionarCompra(Compra compra) {
        this.compra.add(compra);
    }

    double obterValorTotal() {
        double total = 0;

        for (Compra c: compra) {
            total += c.obterValorTotal();
        }

        return total;
    }
}
