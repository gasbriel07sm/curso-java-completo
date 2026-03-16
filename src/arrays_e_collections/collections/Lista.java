package arrays_e_collections.collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // como a lista é indexada, o get() serve para retornar algum elemento

        // remoção de elementos
        System.out.println(lista.remove(1)); // remover pelo índice, retorna o valor que foi removido
        System.out.println(lista.remove(new Usuario("Manu"))); // retorna true ou false

        // contém elemento
        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));

        for (Usuario u: lista) {
            System.out.println(u.nome); // ordem permanece
        }
    }
}
