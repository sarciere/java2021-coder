package oo.desafio;

public class CompraTeste {
    public static void main(String[] args) {        
        Compra compra1 = new Compra();
        compra1.adicionarItemNaCompra(new Produto("Feijao", 10), 5);
        compra1.adicionarItemNaCompra(new Produto("Arroz", 15), 5);

        Compra compra2 = new Compra();
        compra2.adicionarItemNaCompra(new Produto("Feijao", 10), 5);
        compra2.adicionarItemNaCompra(new Produto("Arroz", 15), 5);
        
        Cliente cliente = new Cliente("João"); 

        cliente.adicionarCompras(compra1);
        cliente.adicionarCompras(compra2);

        System.out.printf("O cliente %s efetuou %d compras, somando um total de R$ %f", 
            cliente.nome, cliente.compras.size(), cliente.obterTotalDasCompras());        
    }
    
      
    
}
