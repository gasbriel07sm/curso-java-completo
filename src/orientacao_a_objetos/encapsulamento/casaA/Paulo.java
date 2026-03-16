package orientacao_a_objetos.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void testeAcessos(){
        // System.out.println(esposa.segredo); (private possui acesso somente na mesma classe)
        System.out.println(esposa.facoDentroDeCasa); // pacote
        System.out.println(esposa.formaDeFalar); // por morar na mesma casa (protected)
        System.out.println(esposa.todosSabem); // público é visível por todos
    }
}
