package orientacao_a_objetos.heranca.teste;

import orientacao_a_objetos.heranca.desafio.Carro;
import orientacao_a_objetos.heranca.desafio.Civic;
import orientacao_a_objetos.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Civic(250);
        Carro c2 = new Ferrari(300);

        c1.frear();
        c1.frear();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Velocidade: " + c1.velocidadeAtual);

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        System.out.println("Velocidade: " + c2.velocidadeAtual);
    }
}
