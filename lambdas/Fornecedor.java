package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        // Supplier tem o conceito de fornecedor para te retornar algo;
        // nesse teste estou esperando como retorno um tipo lista;
        // **Ela não recebe nenhum parametro e te retorna algo;
        Supplier<List<String>> umList = () ->  Arrays.asList("Ana", "Bia", "Lia", "Gui");

        // Método .get() é o que aciona o retono da função criada;
        System.out.println(umList.get());
    }    
}
