package orientacao_a_objetos.heranca.desafio;

public class Carro {
    // velocidade atual, acelerar, frear
    // nao pode ser menor que 0 a velocidade, na classe especifica teremos sobrescrita de métodos

    private final int VELOCIDADE_MAXIMA;
    public double velocidadeAtual = 40;
    public int delta = 5;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    public void frear() {
        if (velocidadeAtual >= delta) {
            velocidadeAtual -= delta;
        } else {
            velocidadeAtual = 0;
        }
    }
}
