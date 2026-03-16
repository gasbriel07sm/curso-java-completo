package arrays_e_collections.equals_hashcode;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com.br";

        System.out.println(u1 == u2); // falso, pois o "==" irá comparar apenas o endereço de memória e não o conteúdo

        System.out.println(u1.equals(u2)); // false
        System.out.println(u2.equals(u1)); // false

//        System.out.println(u1 == u1);
//        System.out.println(u2 == u2);

        System.out.println(u2.equals(new Date()));
    }
}
