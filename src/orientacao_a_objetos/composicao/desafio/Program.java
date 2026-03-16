package orientacao_a_objetos.composicao.desafio;

public class Program {
    public static void main(String[] args) {

        Produto p1 = new Produto("Arroz", 10.50);
        Produto p2 = new Produto("Feijão", 13.60);
        Produto p3 = new Produto("Macarrão", 4.50);
        Item i1 = new Item(2, p1);
        Item i2 = new Item(5, p2);
        Item i3 = new Item(6, p3);

        Compra c = new Compra();
        c.item.add(i1);
        c.item.add(i2);
        c.item.add(i3);

        Cliente cl = new Cliente("Gabriel");
        cl.compra.add(c);

        System.out.println("Total do Cliente: " + cl.obterValorTotal());

    }
}
