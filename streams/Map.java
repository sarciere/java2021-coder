package streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);      

        System.out.println("\n\nUsando composição...");
        marcas.stream()
            .map(Utiitarios.maiscula)
            .map(Utiitarios.primeiraLetra)
            .map(Utiitarios::grito)
            .forEach(print);
    }
}
