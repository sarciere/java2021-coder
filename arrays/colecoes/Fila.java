package arrays.colecoes;

import java.rmi.server.SocketSecurityException;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
            Queue<String> Fila = new LinkedList<>();

            //offer e add -> adicionam elementos na fila
            //Diferença é o comportamento ocorre quando a fila está cheia!
            Fila.add("Ana"); //Retorna true ou false, mas caso tenha erro, retorna uma exceção
            Fila.offer("Sergio"); //Retorna true ou false, mas caso tenha erro, retorna uma exceção            

            //Peek e Element -> obter o proximo elemento da fila(sem remover)
            //Diferença é o comportamento ocorre quando a fila está vazia!
            System.out.println(Fila.peek()); //retorna null
            System.out.println(Fila.element()); // lança exceção
            System.out.println(Fila.poll()); //remove o dado, caso não consiga retorna null
            System.out.println(Fila.remove()); //remove mas se não conseguir lanca uma exceção
        
    }
}
