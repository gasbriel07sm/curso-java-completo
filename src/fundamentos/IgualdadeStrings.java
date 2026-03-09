package fundamentos;

import java.util.Scanner;

public class IgualdadeStrings {
    public static void main(String[] args) {

        /**
         * A comparação com Strings pode ser feita com "==", porém irá avaliar se o local da memoria é o mesmo
         */

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(2));
        // o equals avalia o conteúdo, já o "==" o tipo também

        Scanner sc = new Scanner(System.in);

        String s2 = sc.next();
        System.out.println("2".equals(s2.trim()));
        // trim() tira os espaços em branco
        
        sc.close();
    }
}
