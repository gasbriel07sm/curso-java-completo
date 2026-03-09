package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // byte
        Byte b = 100;
        Short s = 1000;
        //  Integer i = Integer.parseInt(sc.next()); // Integer.parseInt() serve para converter uma String em um inteiro
        Integer i = 10000;
        Long l = 10000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString()); // trnsformar numero para string
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true"); // converte String para booleano
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // char
        System.out.println(c.toString());

       // sc.close();
    }
}
