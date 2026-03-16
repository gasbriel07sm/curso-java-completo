package orientacao_a_objetos.heranca.teste;

import orientacao_a_objetos.heranca.Heroi;
import orientacao_a_objetos.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 20;

        Heroi heroi = new Heroi(10,11);

        System.out.println("MONSTRO VIDA: " + monstro.vida);
        System.out.println("HEROI VIDA: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("MONSTRO VIDA: " + monstro.vida);
        System.out.println("HEROI VIDA: " + heroi.vida);
    }
}
