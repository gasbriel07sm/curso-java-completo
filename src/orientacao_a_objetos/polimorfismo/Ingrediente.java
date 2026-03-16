package orientacao_a_objetos.polimorfismo;

public class Ingrediente {

    private double peso;

    public Ingrediente(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
