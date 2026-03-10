package estruturas_de_controle;

public class EstruturaSwitch {
    public static void main(String[] args) {
        /**
         * Para estrutura de múltiplas escolhas temos a estrutura switch
         * switch (expressao) {
         *  case valor:
         *      (comando);
         *      break;
         *  case valor 2:
         *      (comando);
         *      break;
         *  default:
         *     (comando);
         *     break;
         * }
         */
        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sri o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
                System.out.println("Não sei nada");
        }
    }
}
