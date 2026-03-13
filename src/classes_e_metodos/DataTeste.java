package classes_e_metodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(); // instanciando d1 do tipo Data

        Data d2 = new Data(25, 6, 2007); // instanciando d2 do tipo Data

        System.out.println("DATA 1: ");
        System.out.println(d1.obterDataFormatada());

        System.out.println("\nDATA 2: ");
        System.out.println(d2.obterDataFormatada());
    }
}
