package classes_e_metodos.desafio;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida c) {
        this.peso += c.peso;
    }
}
