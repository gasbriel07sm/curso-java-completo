package fundamentos;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {

        double parte1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        System.out.println(parte1);
        double parte2 = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
        System.out.println(parte2);
        double resultado = Math.pow((parte1 - parte2), 3) / Math.pow(10,3);
        System.out.println(resultado);
    }
}
