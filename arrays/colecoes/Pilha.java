package arrays.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");
    }    
}
