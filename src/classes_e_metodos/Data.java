package classes_e_metodos;

public class Data {
    // definindo os atributos
    int dia;
    int mes;
    int ano;

    Data() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
         this(1, 1, 1970); // usando como método (chama um construtor)
    }

    // VALORES PADRÃO (quando não se define nada)
    // byte, short, int, long -> 0
    // float, double -> 0.0
    // boolean -> false
    // char -> '\u0000'
    // objeto -> null (não aponta para nenhum local de memória)

    // variáveis locais dentro de métodos, ... devem ser inicializadas, mesma coisa com constantes, devem ser inicializadas

    public Data(int dia, int mes, int ano) {
        this.dia = dia; // a palavra this serve para referenciar o objeto padrão (que está sendo criado naquele momento)
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        final String formato = "%d/%d/%d"; // variável / constante  local (dentro de um método) -> o escopo é apenas dentro daquele método, a partir daquela linha
        return String.format(formato , this.dia, this.mes, this.ano);
    }
}
