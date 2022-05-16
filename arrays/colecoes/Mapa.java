package arrays.colecoes;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "value");//vai incluir o dado
        usuarios.put(1, "value2");//vai atualizar e mudar o nome

        usuarios.size();
        usuarios.isEmpty();
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("value"));

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()){
            System.out.println(valor);
        }

        for (java.util.Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
