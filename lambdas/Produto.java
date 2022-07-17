package lambdas;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Produto {

    final String nome;
    final double preco;
    final double desconto; 
    
    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;
    }

    public String toString(){
        return nome;
    }

    Function<Produto, Double> precoDesconto = (Produto) -> (Produto.preco * (1 - Produto.desconto ));
    UnaryOperator<Double> impostoMunicipal = valor -> ( valor >= 2500 ? (valor * 1.085): valor);
    UnaryOperator<Double> PrecoComfrete = valor -> (valor >= 3000 ? valor + 100 : valor + 50);
    UnaryOperator<Double> Arredondar = valor -> (Math.round(valor * 100) / 100.0);
    Function<Double, String> Formatar = valor -> String.format("O preço final é: R$ %.2f", valor).replace(",", ".");
}
