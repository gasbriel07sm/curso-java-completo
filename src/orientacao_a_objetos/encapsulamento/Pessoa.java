package orientacao_a_objetos.encapsulamento;

public class Pessoa {

    private int idade;

    // GET (getters) - serve para ler
    public int getIdade() {
        return idade;
    }

    // SET (setters) - serve para alterar
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        }
    }
}
