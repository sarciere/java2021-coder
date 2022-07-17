package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUniario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = 
            maisDois //Somará +2
                .andThen(vezesDois) //Multiplicará 2 por 2;
                .andThen(aoQuadrado) //Vai calcular o quadrador do resultasdo de vezesDois;
                .apply(0); //Método acionador de todo o fluxo;
        System.out.println(resultado1);

        /*
         * O Compose tem como função executar o processo do fim para o começo, o apply funciona do inicio ao fim
         */
        int resultado2 = aoQuadrado
            .compose(vezesDois)
            .compose(maisDois)
            .apply(0);
        System.out.println(resultado2);
    }
}
