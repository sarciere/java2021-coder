package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        double total = 0;
        Compra compra = new Compra();
        compra.adicionarItem(new Item("nome", 1.0, 100.90));
        compra.adicionarItem("nome", 2.0, 1000);

        total = compra.obterValorTotal();
        System.out.println(total);
    }
}
