package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        // devolver algo -> não recebe nenhum parâmetro e retorna algo

        Supplier<List<String>> umaLista =
                () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
        // os parênteses são obrigatórios já que não temos nenhuma entrada

        System.out.println(umaLista.get()); // retorna os dados

    }
}
