package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2{
    public static void main(String[] args) {
        //Lambdas utilizando interfaces funcionais nativas do java, como BinaryOperator;
        BinaryOperator<Double> calc = (a, b) -> { return a + b;};
        System.out.println(calc.apply(2.0, 3.0));

        calc = (a, b) -> a * b;
        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc1 = (a, b) -> { return a + b;};
        System.out.println(calc1.apply(5, 5));
    }
}
