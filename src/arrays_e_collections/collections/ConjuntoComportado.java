package arrays_e_collections.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        // Set<String> lista = new HashSet<>(); // obriga a lista a ser do tipo String
        SortedSet<String> lista = new TreeSet<>(); // pertence ao SortedSet -> ordenado (aceita ordenação)
        lista.add("Ana");
        lista.add("Luca");
        lista.add("Carlos");
        lista.add("Pedro");

        for(String nome: lista) {
            System.out.println(nome + " ");
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums) {
            System.out.println(n);
        }

    }
}
