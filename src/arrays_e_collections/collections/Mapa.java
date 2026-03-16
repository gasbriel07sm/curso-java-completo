package arrays_e_collections.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>(); // o Map é uma estrutura de chave e valor, por isso temos dois valores enter <>

        // adicionando valores (put serve para adicionar e substituir)
        usuarios.put(1, "Roberto"); // adicionamos com put() - adiciona se não existir, e substitui caso já exista
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        // .size(); retorna o tamanho do map
        // .isEmpty(); verificar se está vazio ou não

        System.out.println(usuarios.keySet()); // retorna todas as chaves (o primeiro valor) -> KEYS
        System.out.println(usuarios.values()); // retorna todos os valores (o segunddo valor) -> VALUES
        System.out.println(usuarios.entrySet()); // retorna chave e valor simultaneamente

        System.out.println(usuarios.containsKey(20)); // verificar se contém determinada chave
        System.out.println(usuarios.containsValue("Rebeca")); // verificar se contém determinado valor

        System.out.println(usuarios.get(3)); // retorna o valor de determinada chave passada como parâmetro

        // percorrendo valores de um Map
        // percorrendo primeiro a chave
        for (int chave: usuarios.keySet()) {
            System.out.print(chave + " ");
        }
        System.out.println();

        // percorrendo os valores
        for (String valores: usuarios.values()) {
            System.out.print(valores + " ");
        }
        System.out.println();

        // percorrendo chave e valor simultaneamente
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }
    }
}
