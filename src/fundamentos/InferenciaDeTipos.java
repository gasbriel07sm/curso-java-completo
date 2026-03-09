package fundamentos;

public class InferenciaDeTipos {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5; // inferir pelo valor da variável, inferi o tipo pelo valor
        System.out.println(b);

        var c = "Ola";
        System.out.println(c);
        c = "Outro texto";
        System.out.println(c);

        // as variáveis em Java recebem um valor desde o ínicio do programa e não pode ter seu tipo alterado ao longo do programa

        double d; // variável declarada
        d = 123.65; // inicialização da variável
        System.out.println(d);

        var e = 123.45; // se for declarada com var, o valor deve ser declarada e inicializada ao mesmo tempo
    }
}
