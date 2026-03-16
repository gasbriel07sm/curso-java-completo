package orientacao_a_objetos.heranca.desafio;

public class Ferrari extends Carro{
//    @Override
//    void acelerar() {
//        super.acelerar();
//        super.acelerar();
//        super.acelerar();
//    }


    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

//    @Override // serve para deixar claro que está sobreescrevendo
//    void acelerar() {
//        velocidadeAtual += 15;
//    }
}
