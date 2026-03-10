package estruturas_de_controle;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
               break; // desvia o fluxo atual
            }
            System.out.println(i);
        }
        System.out.println("Fim");
    }
}
