package orientacao_a_objetos.heranca;

public class Heroi extends Jogador{
    // implementando a herança, onde Heroi herda todas as características de Jogador
    // sobreescrever métodos

    Heroi(int x, int y) {
        super(x, y);
    }

    @Override
    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }
}
