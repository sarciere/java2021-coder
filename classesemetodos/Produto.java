package classesemetodos;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(){
        
    }

    Produto(String nomeInicial, double precoInicial, double desconto){
        nome = nomeInicial;
        preco = precoInicial;
        this.desconto = desconto;
    }  

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(float percentualDescontoGerente){
        return preco * (1 -  (desconto + percentualDescontoGerente));
    }
}
