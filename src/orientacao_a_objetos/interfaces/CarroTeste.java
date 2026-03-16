package orientacao_a_objetos.interfaces;

import orientacao_a_objetos.interfaces.Carro;
import orientacao_a_objetos.interfaces.Civic;
import orientacao_a_objetos.interfaces.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Civic(250);
        Ferrari c2 = new Ferrari(300);

        c1.frear();
        c1.frear();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Velocidade: " + c1.velocidadeAtual);

        c2.acelerar();
        c2.acelerar();
        System.out.println("Velocidade: " + c2.velocidadeAtual);
        c2.ligarTurbo();
        c2.acelerar();
        System.out.println("Velocidade: " + c2.velocidadeAtual);
        c2.acelerar();
        System.out.println("Velocidade: " + c2.velocidadeAtual);
        c2.desligarTurbo();
        c2.acelerar();
        System.out.println("Velocidade: " + c2.velocidadeAtual);
    }
}
