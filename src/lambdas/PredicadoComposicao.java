package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        // predicado é uma interface funcional que retorna verdadeiro ou falaso

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos =
                num -> num >= 100 && num <= 999;

        // and() funciona como o operador E (&&)
        System.out.println(isPar.and(isTresDigitos).test(122));

        // or() funciona como o operador OU (||)
        System.out.println(isPar.or(isTresDigitos).test(7));

        // temos o operador negate() que serve como o operador NÃO (!)
        System.out.println(isPar.negate().test(8));

    }
}
