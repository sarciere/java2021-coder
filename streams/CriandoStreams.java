package streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        /*
         * Conceito deste arquivo é mostrar como criar o stream de dados de formas diferentes
         */
        Consumer<Object> print = System.out::print;


        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 4).forEach(print);
        List<String> outrasLangs = Arrays.asList("C ", "Php ", "Kotlin");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // Stream.generate(() -> "A").forEach(print);
        // Stream.iterate(0, n -> n +1 ).forEach(print);
    }
}
