package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<Item>();

    void adicionarItemNaCompra(Produto p, int quantidade){
        this.itens.add(new Item(p, quantidade));
    }

    double obterTotalDaCompra(){
        double total = 0;
        for (Item item : itens){
            total += item.produto.preco * item.quantidade;
        }
        return total;
    }
}
