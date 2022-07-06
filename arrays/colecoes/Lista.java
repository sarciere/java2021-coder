package arrays.colecoes;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario user1 = new Usuario("Sergio");
        lista.add(user1);

        lista.add(new Usuario("teste1"));
        lista.add(new Usuario("teste2"));
        lista.add(new Usuario("teste3"));                
        lista.add(new Usuario("teste4"));

        System.out.println(lista.get(3));
        for (Usuario users : lista) {
            System.out.println(users.nome);
        }

    }
    
}
