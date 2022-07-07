package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;    
    final List<Compra> compras = new ArrayList<Compra>();

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompras(Compra compra){
        this.compras.add(compra);
    }

    double obterTotalDasCompras(){
        double total = 0;
        for (Compra compra : compras) {
            total += compra.obterTotalDaCompra();
        }
        return total;
    }
}
