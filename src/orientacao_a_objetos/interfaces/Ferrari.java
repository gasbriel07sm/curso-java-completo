package orientacao_a_objetos.interfaces;

public class Ferrari extends Carro implements Esportivo, Luxo {
//    @Override
//    void acelerar() {
//        super.acelerar();
//        super.acelerar();
//        super.acelerar();
//    }

    private boolean ligarTurbo;
    private boolean ligarAr;


    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    // implementando os métodos obrigatórios
    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if(ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

    //    @Override // serve para deixar claro que está sobreescrevendo
//    void acelerar() {
//        velocidadeAtual += 15;
//    }
}
