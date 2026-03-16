package orientacao_a_objetos.encapsulamento.casaB;

import orientacao_a_objetos.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos(){
        Ana sogra = new Ana();
//        System.out.println(sogra.segredo);
//        System.out.println(sogra.facoDentroDeCasa); // pacote
//        System.out.println(sogra.formaDeFalar); // por ter herança, herda os atributos
        System.out.println(sogra.todosSabem); // público é visível por todos
    }
}
