package orientacao_a_objetos.composicao;

public class Motor {

    Carro carro;

    public Motor(Carro carro) {
        this.carro = carro;
    }

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
