package oo.desafio;

public class Item {
    int quantidade;
    Produto produto;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String toString(){
        return this.produto.nome;
    }

}
