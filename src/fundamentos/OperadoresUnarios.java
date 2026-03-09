package fundamentos;

public class OperadoresUnarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1 (pós fixado) - incrementa depois de realizar algum comando
        a--; // a = a - 1 (pós fixado) - decrementa depois de realizar algum comando
        ++a; // a = a + 1 (pré fixado) - incrementa primeiro e depois realiza o comando
        --a; // a = a - 1 (pré fixado) - decrementa primeiro e depois realiza o comando

        System.out.println(a);
        System.out.println(b);

        System.out.println(++a == b--);

        System.out.println(a);
        System.out.println(b);

    }
}
