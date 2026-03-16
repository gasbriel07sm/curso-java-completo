package arrays_e_collections.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>(); // declarando uma fila
        // em uma fila, temos o primeiro que entra é o primeiro que sai (FIFO) -> FIRST IN, FIRST OF

        // diferença de add para offer:
        // os dois adicionam elementos na fila, a diferença é o comportamento quando a fila está cheia!
        // o offer() retorna exceção enquanto o add() não
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        // se a fila estiver vazia, o peek retorna nulo, já o element() retorna exceção, a diferença está no comportamento quando a fila está vazia
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());

        // fila.size() -> retornar o tamanho da fila
        // fila.clear() -> limpar a fila
        // fila.isEmpty(); -> verificar se a fila está vazia
        // fila.contains() -> verificar se contém um elemento dentro da fila

        // Pool e Remove -> obter o próximo elemento da fila e remove
        // Diferença do comportamento ocorre se a fila estiver vazia
        System.out.println(fila.poll()); // retorna o próximo elemento da fila (removendo)
        System.out.println(fila.remove()); // se chamar o remove quando a fila estiver vazia, lança uma excecção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // retorna nulo se a fila estiver vazia
    }
}
