package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
 
public class ImprimindoObjetos {
    public static void main(String[] args) {

        /*
         * Conceito desse arquivo é mostrar como é possivel realizar as impressoes de uma lista
         * cada vez de forma mais abstrata. Do mais comum, ao mais abstrato.
         */

        List<String> Lista = Arrays.asList("Mia","Lu", "Luca", "Ana");

        System.out.println("Forma convencional");
        for (int i = 0; i < Lista.size(); i++) {
            System.out.println(Lista.get(i));            
        }

        System.out.println("\nUsando o forEach");
        for (String nome : Lista) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator");
        Iterator<String> iterator = Lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream");
        Stream<String> stream = Lista.stream();
        stream.forEach(System.out::println);
    }
}
