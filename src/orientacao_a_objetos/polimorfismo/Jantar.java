package orientacao_a_objetos.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Ingrediente ingrediente1 = new Arroz(0.20);
        Ingrediente ingrediente2 = new Feijao(0.10);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        System.out.println(convidado.getPeso());

        Ingrediente sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());
    }
}
