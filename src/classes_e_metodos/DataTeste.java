package classes_e_metodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(); // instanciando d1 do tipo Data
        d1.dia = 13;
        d1.mes = 3;
        d1.ano = 2026;

        Data d2 = new Data(); // instanciando d2 do tipo Data
        d2.dia = 25;
        d2.mes = 6;
        d2.ano = 2007;

        System.out.println("DATA 1: ");
        System.out.printf("%d/%d/%d %n", d1.dia, d1.mes, d1.ano);

        System.out.println("\nDATA 2: ");
        System.out.printf("%d/%d/%d %n", d2.dia, d2.mes, d2.ano);
    }
}
