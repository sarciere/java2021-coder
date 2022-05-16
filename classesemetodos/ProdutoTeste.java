package classesemetodos;

public class ProdutoTeste {
    public static void main(String[] args) {

        metodos m = new metodos();
        
        Produto p1 = new Produto("Notebook", 4500.00, 0.28);
        Produto p2 = new Produto("Caneta", 10, 0.28);
        
        double resultado = m.somarNumeros(p1.preco, p2.preco);
        m.montarMensagemDeRetorno("A soma dos dois produtos é " + resultado);
    }
}
