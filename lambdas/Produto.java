package lambdas;

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
}
