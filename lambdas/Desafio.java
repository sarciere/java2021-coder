package lambdas;

public class Desafio {
    public static void main(String[] args) {
        Produto p1 = new Produto("Ipad", 2500.90, .15);      

        String Resultado = 
            p1.precoDesconto
                .andThen(p1.impostoMunicipal)
                .andThen(p1.PrecoComfrete)
                .andThen(p1.Arredondar)
                .andThen(p1.Formatar)
                .apply(p1);

        System.out.println(Resultado);
        
    }
}
