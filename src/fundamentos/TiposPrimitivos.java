package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // 8 tipos primitivos
        /**
         * Números inteiro:
         * 1) Byte - 1 bytes
         * 2) Short - 2 bytes
         * 3) Int - 4 bytes
         * 5) Long - 8 bytes
         *
         * Números flutuantes:
         * 5) Float - 4 bytes
         * 6) Double - 8 bytes
         *
         * 7) Char - caractere delimitado por aspa simples
         * 8) Bollean - true ou false (1 bit)
         *
         * .0 -> double
         * literal -> int
         * 0F -> long
         *
         * Conversão -> do menor para o maior não tem problema, do maior para o menor é mais complicado
         */

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 3276;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        char status = 'A';

        boolean estaDeFerias = false;

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        // Números de viagem
        System.out.println(numeroDeVoos / 2);
        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
