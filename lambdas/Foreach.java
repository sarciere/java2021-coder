package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("maria", "joão", "ana");

        //Forma comum
        System.out.println("Forma tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        //Forma com lambda
        //nome é um parametro passado, não é o mesmo declarado acima
        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> {System.out.printf("%s !!!", nome);});

        //Forma com Method reference
        System.out.println("\nMethod reference #01");
        aprovados.forEach(System.out::printf);         

        //Forma com lambda #2
        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> {meuImprimir(nome);});

        //Forma com Method reference #2
        System.out.println("\nMethod reference #02");
        aprovados.forEach(Foreach::meuImprimir);        
    }

    static void meuImprimir(String nome){
        System.out.printf("Meu nome é %s.", nome);
    }
}
