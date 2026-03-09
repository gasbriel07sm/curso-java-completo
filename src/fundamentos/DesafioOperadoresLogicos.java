package fundamentos;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

        boolean tv50 = trabalhoTerca && trabalhoQuinta;
        boolean tv32 = trabalhoTerca ^ trabalhoQuinta;
        boolean tomarSorvete = trabalhoTerca || trabalhoQuinta;

        System.out.println("TV50? : " + tv50);
        System.out.println("TV32? : " + tv32);
        System.out.println("Tomar sorvete? : " + tomarSorvete);
        System.out.println("Saudavel? : " + !tomarSorvete);
    }
}
