package fundamentos;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        System.out.println("\nTabela Verdade E (AND");
        System.out.println("V && V = " + (true && true));
        System.out.println("V && F = " + (true && false));
        System.out.println("F && V = " + (false && true));
        System.out.println("F && F = " + (false && false));

        System.out.println("\nTabela Verdade OU (OR");
        System.out.println("V || V = " + (true || true));
        System.out.println("V || F = " + (true || false));
        System.out.println("F || V = " + (false || true));
        System.out.println("F || F = " + (false || false));

        System.out.println("\nTabela Verdade OU EXCLUSIVO (XOR");
        System.out.println("V ^ V = " + (true ^ true));
        System.out.println("V ^ F = " + (true ^ false));
        System.out.println("F ^ V = " + (false ^ true));
        System.out.println("F ^ F = " + (false ^ false));

        System.out.println("\nTabela Verdade NÃO (NOT");
        System.out.println("!V = " + (!true));
        System.out.println("!F = " + (!false));
    }
}
