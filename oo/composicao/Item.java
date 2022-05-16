package oo.composicao;

public class Item {
    String nome;
    Double quantidade;
    Double valor;
    Compra compra;

    Item(String nome, Double quantidade, Double valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;        
    }
}
