package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = 
            p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Mouse pad", 29.00, 0.02);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Fone", 200.00, 0.10);
        Produto p3 = new Produto("Livro", 79.00, 0.22);

        List<Produto> produtos = Arrays.asList(p1, p2, p3);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
        
    }
}
