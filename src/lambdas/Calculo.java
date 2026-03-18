package lambdas;

// o Lambda só funciona com uma interface funcional >> a partir dessas interfaces que teremos as funções lambdas
@FunctionalInterface
// força a ter apenas um método, pode ter mais de um método, porém deve ter um abstrato
public interface Calculo {

    double executar(double a, double b);

//    default String legal() {
//        return "legal";
//    }

//    static String massa() {
//        return "Muito legal";
//    }
}
