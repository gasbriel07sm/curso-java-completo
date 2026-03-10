package estruturas_de_controle;

public class EstruturaFor {
    public static void main(String[] args) {
        /**
         * For é usado quando se tem uma quantidade já determinada de repetições
         * for (<inicialização>; <condição>; <incremento>){
         *    <comandos>
         * }
         */

        for (int contador = 0; contador <= 20; contador += 2) {
            System.out.printf("i = %d\n", contador);
        }

        int x = 2;
        for (;x < 10;) {
            System.out.println("x = " + x);
            x++;
        }

        // laço infinito
//        for(;;) {
//            System.out.println("Fim");
//        }
    }
}
