package oo.composicao;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> Itens = new ArrayList<Item>();

    void adicionarItem(String nome, double quantidade, double valor){
        this.adicionarItem(new Item(nome, quantidade, valor));
    }

    void adicionarItem(Item item){
        Itens.add(item);
        item.compra = this;
    }

    double obterValorTotal(){
        double total = 0;
        for (Item item : Itens) {
            total += item.quantidade * item.valor;
        }
        return total; 
    }   
    
}
