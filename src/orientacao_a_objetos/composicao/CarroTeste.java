package orientacao_a_objetos.composicao;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c = new Carro();
        System.out.println("Está ligado? " + c.estaLigado());
        c.ligar();
        System.out.println("Está ligado? " + c.estaLigado());

        System.out.println(c.motor.giros());

        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        System.out.println(c.motor.giros());

        c.frear();
        c.frear();
        c.frear();
        c.frear();
        System.out.println(c.motor.giros());
    }
}
