package orientacao_a_objetos.abstrato;

public abstract class Mamifero extends Animal{

    @Override
    public String mover() {
        return "Usando as patas";
    }

    public abstract String mamar();
}
