package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("maria", "joão", "ana");

        //Forma comum
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        //Forma com lambda
        aprovados.forEach(nome -> {System.out.printf("%s !!!", nome);});

        //Forma com Method reference
        aprovados.forEach(System.out::printf);        

        //Forma com lambda #2
        aprovados.forEach(nome -> {meuImpŕimir(nome);});

        //Forma com Method reference #2
        aprovados.forEach(Foreach::meuImpŕimir);        
    }

    static void meuImpŕimir(String nome){
        System.out.printf("Meu nome é %s.", nome);
    }
}
