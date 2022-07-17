package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        /*Forma 1*/
        BiFunction<Double, Double, String> resultado = (n1, n2) -> (n1 = n2) /2 >= 7 ? "Aprovado" : "Reprovado";

        /*
            Forma 2 Função com um conceito mais encapsulado, pois faz mais de uma coisa junto;
        */        
        BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
            double notaFinal = (n1 = n2) /2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        /*
         * Função com um unico proposito, que torna possivel trabalhar com composicao em outra função
         */
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(5.1, 9.7));
        System.out.println(resultado2.apply(5.1, 9.7));

        System.out.println(media.andThen(conceito).apply(9.7, 5.1));
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));        
        
    }
}
