package lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimir.accept(p1); // recebe e faz o consumer

        Produto p2 = new Produto("Notebook", 2897.99, 0.99);
        Produto p3 = new Produto("Caderno", 19.90, 0.15);
        Produto p4 = new Produto("Borracha", 34.78, 0.49);
        Produto p5 = new Produto("Lápis", 4.39, 0.59);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir); // o forEach recebe um Consumer
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
