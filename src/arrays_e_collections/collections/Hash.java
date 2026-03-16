package arrays_e_collections.collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Ana"));

        System.out.println(usuarios.contains(new Usuario("Guilherme")));
    }
}
