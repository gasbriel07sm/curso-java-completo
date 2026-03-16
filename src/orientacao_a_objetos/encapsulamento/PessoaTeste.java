package orientacao_a_objetos.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setIdade(30); // setar (alterar) a idade
        // p1.setIdade(-30); >> não permite criar idade negativa
        System.out.println(p1.getIdade()); // ler a idade
    }
}
