package arrays.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "value");//vai incluir o dado
        usuarios.put(1, "value2");//vai atualizar e mudar o nome

        usuarios.size(); //Mostra o tamanho
        usuarios.isEmpty(); //Verifica se é vazio
        System.out.println(usuarios.keySet()); //retorna a chave dos registros
        System.out.println(usuarios.values()); //retorna os valores dos registros
        System.out.println(usuarios.entrySet()); //retorna chave e valor do registro
        System.out.println(usuarios.containsKey(1));//verifica se existe a chave de valor 1 {True ou False}
        System.out.println(usuarios.containsValue("value")); //verifica se contem o valor value  {True ou False}

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()){
            System.out.println(valor);
        }

        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
