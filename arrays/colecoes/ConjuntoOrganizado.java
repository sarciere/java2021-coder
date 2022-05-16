package arrays.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {
    public static void main(String[] args) {
        SortedSet<String> lista = new TreeSet<String>(); //Usando o generics, você define para a lista, um tipo 
        //que será aceito
        // Set<String> lista2 = new HashSet<>(); O hash pode ser criado, sem passar o tipo, porque 
        //como foi definido na variavel, está explicito

        lista.add("Sergio");
        lista.add("Ana");
        lista.add("Maria");

        for (String candidatos : lista) {
            System.out.println(candidatos);            
        }

        Set<Integer> lista2 = new HashSet<Integer>(); //Usando o generics, você define para a lista, um tipo 
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);

        for (Integer Numeros : lista2) {
            System.out.println(Numeros);
        }
    }
}
