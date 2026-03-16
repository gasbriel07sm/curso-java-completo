package orientacao_a_objetos.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c = new Compra();
        c.cliente = "João";
        c.adicionarItem("Caneta", 20, 7.45);
        c.adicionarItem("Borracha", 12, 3.89);
        c.adicionarItem("Caderno", 3, 18.79);

        System.out.println(c.itens.size());
        System.out.println(c.obterValorTotal());
    }
}
