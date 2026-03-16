package arrays_e_collections.collections;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        // Hash Set
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // método add() serve para adicionar itens a collections
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        // irá fazer a conversão dos tipos primitivos para seus Wrappers, pois o conjunto não suporta tipos primitivos
        System.out.println("Tamanho é: " + conjunto.size());
        conjunto.add("Teste"); // não irá adicionar o elemento por já ter o mesmo no conjunto (conjunto não aceita elementos repetidos)
        System.out.println("Tamanho é: " + conjunto.size()); // comprimento / tamanho do conjunto se dá pelo método size()

        // remoção de elementos -> remove() >> retorna verdadeiro ou falso, verdadeiro se consegue excluir e falso se não consegue
        System.out.println(conjunto.remove("Teste")); // remove (true)
        System.out.println(conjunto.remove("teste")); // não remove (false)
        System.out.println("Tamanho é: " + conjunto.size());

        // método contains() >> retorna verdadeiro ou falso, verdadeiro se contém tal elemento e falso se não contem
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(false));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums); // já implementa a forma de mostrar como String
        System.out.println(conjunto);

        // união de conjuntos addAll(), adiciona no conjunto a esquerda os elementos do conjunto da direita
        conjunto.addAll(nums);
        System.out.println(conjunto);
        System.out.println(nums);

        // intersecção de conjuntos retainAll()
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        System.out.println(nums);

        conjunto.clear(); // serve para limpar
        System.out.println(conjunto);
    }
}
