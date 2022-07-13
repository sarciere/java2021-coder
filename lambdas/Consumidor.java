package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Mouse pad", 29.00, 0.02);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Fone", 200.00, 0.10);
        Produto p3 = new Produto("Livro", 79.00, 0.22);

        List<Produto> produtos = Arrays.asList(p1, p2, p3);

        // Method Reference
        produtos.forEach(imprimirNome);
        // Lambda
        produtos.forEach(p -> System.out.println(p.preco));
        /*
         * Como é um lista de objetos, ele ao chamar o println, será acionado o
         * toString da classe Produto, caso não implementado, será escrito a referencia
         * da memoria
         */
        produtos.forEach(System.out::println);

    }
}
