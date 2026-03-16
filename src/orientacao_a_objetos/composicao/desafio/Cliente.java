package orientacao_a_objetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nomeCliente;
    List<Compra> compra = new ArrayList<>();

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    double obterValorTotal() {
        double total = 0;

        for (Compra c: compra) {
            total += c.obterValorTotal();
        }

        return total;
    }
}
