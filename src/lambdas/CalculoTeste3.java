package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        // Interfaces funcionais -> Binary Operator (pega dois elementos de um tipoe  retorna um resultado do mesmo tipo)
        // int -> Double (não dá certo) - não permite
        BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(2.0, 3.0));

        BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; };
        System.out.println(calculo2.apply(2, 3));

        calculo = (x, y) -> x * y;
        System.out.println(calculo2.apply(2, 3));

    }
}
