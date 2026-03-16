package orientacao_a_objetos.heranca.desafio;

public class Carro {
    // velocidade atual, acelerar, frear
    // nao pode ser menor que 0 a velocidade, na classe especifica teremos sobrescrita de métodos

    final int VELOCIDADE_MAXIMA;
    double velocidadeAtual = 40;
    int delta = 5;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    void frear() {
        if (velocidadeAtual >= delta) {
            velocidadeAtual -= delta;
        } else {
            velocidadeAtual = 0;
        }
    }
}
