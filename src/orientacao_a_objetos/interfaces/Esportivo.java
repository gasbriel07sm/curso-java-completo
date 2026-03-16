package orientacao_a_objetos.interfaces;

public interface Esportivo {
    // interface possui métodos e tais métodos não possuem corpo
    // define apenas a necessidade de implementar algo
    // a visibilidade de um método de interface é public, e abstrato, que não possui corpo

    void ligarTurbo();
    void desligarTurbo();
    // é como um contrato, eu torno obrigatório a classe implementar os dois métodos passados
}
