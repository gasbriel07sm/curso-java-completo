package arrays_e_collections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>(); // declarando uma pilha de livros
        // em uma pilha, temos o primeiro que entra é o último que sai (LIFO) -> LAST IN, FIRST OF

        livros.add("O Pequeno Principe"); // retorna verdadeiro ou falso
        livros.push("Dom Quixote"); // pode lançar uma exceção caso coloque um valor que supere o tamanho da pilha
        livros.push("O Hobbit");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        System.out.println(livros.peek()); // diferente da fila, retorna o último elemento adicionado, ao inves do primeiro
        System.out.println(livros.element());

        // Pool e Remove e Pop -> obter o próximo elemento da fila e remove
        System.out.println(livros.poll());
        System.out.println(livros.pop()); // assim como o remove(), pop() também lança exceção
        System.out.println(livros.remove());

//        livros.size();
//        livros.clear();
//        livros.contains();
//        livros.isEmpty();
    }
}
