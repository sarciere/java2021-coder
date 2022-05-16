package arrays.colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.7);
        conjunto.add(3);
        conjunto.add(true);
        conjunto.add("C");        
        conjunto.add('C');

        conjunto.size(); //retorna o tamanho
        conjunto.remove("C"); // retorna booleano, caso consiga remover o valor do parÂmetro
        conjunto.contains(true); //retorna booleano, caso contenha o valor do parâmetro
        conjunto.clear();//limpa o conjunto
        
    }
}
