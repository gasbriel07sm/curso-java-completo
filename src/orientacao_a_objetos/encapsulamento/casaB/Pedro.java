package orientacao_a_objetos.encapsulamento.casaB;

import orientacao_a_objetos.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos(){
        // System.out.println(segredo); (privado é visto somente dentro da classe)
        // System.out.println(facoDentroDeCasa); // pacote
        System.out.println(formaDeFalar); // por ter herança, herda os atributos
        System.out.println(todosSabem); // público é visível por todos
    }
}
