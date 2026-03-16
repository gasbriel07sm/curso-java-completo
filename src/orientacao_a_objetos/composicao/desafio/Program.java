package orientacao_a_objetos.composicao.desafio;

public class Program {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Gabriel");

        Compra c1 = new Compra();
        c1.adicionarItem("Caneta", 9.67, 100);
        c1.adicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra c2 = new Compra();
        c2.adicionarItem("Caderno", 10, 10);
        c2.adicionarItem(new Produto("Impressora", 998.90), 1);

//        cliente.compra.add(c1);
//        cliente.compra.add(c2);

        cliente.adicionarCompra(c1);
        cliente.adicionarCompra(c2);

        System.out.println("O valor total da compra é: R$ " + cliente.obterValorTotal());



    }
}
