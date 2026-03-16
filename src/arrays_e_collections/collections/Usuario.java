package arrays_e_collections.collections;

import java.util.Objects;

public class Usuario {

    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
