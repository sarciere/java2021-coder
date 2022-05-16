package lambdas;

public class CalculoTeste {
    public static void main(String[] args) {
        //Forma convencional de utilizar, criando-se classe para implementar a regra de negócio
        Calculo calcular = new Somar();
        System.out.println(calcular.executar(1, 2));

        calcular = new Multiplicar();
        System.out.println(calcular.executar(1, 2));

        // Forma de utilizar uma função lambda com programação funcional
        Calculo calc = (a,b) -> {return a + b;};
        System.out.println(calc.executar(1, 2));

        //Dessa forma, sem definido o return, automaticamente vai retornar a expressao, porém só pode 
        //se utilizar dessa forma, removendo as chaves {}
        calc = (x, y) -> x * y;
    
        System.out.println(calc.executar(2, 2));
        System.out.println(calc.Legal());
        System.out.println(Calculo.muitoLegal());
    }
}
