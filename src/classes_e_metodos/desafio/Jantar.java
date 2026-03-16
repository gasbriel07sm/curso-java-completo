package classes_e_metodos.desafio;

import java.util.Locale;

public class Jantar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Comida c1 = new Comida("feijão", 0.220);
        Comida c2 = new Comida("arroz", 1.243);
        Comida c3 = new Comida("bolo", 3.200);
        Comida c4 = new Comida("pizza", 2.500);
        Pessoa p1 = new Pessoa("João", 80.00);

        System.out.printf("Peso: %.2f%n", p1.peso);
        p1.comer(c1);
        System.out.printf("Peso: %.2f%n", p1.peso);
        p1.comer(c2);
        System.out.printf("Peso: %.2f%n", p1.peso);
        p1.comer(c3);
        System.out.printf("Peso: %.2f%n", p1.peso);
        p1.comer(c4);
        System.out.printf("Peso: %.2f%n", p1.peso);
    }
}
