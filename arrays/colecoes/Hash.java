package arrays.colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> users = new HashSet<>();

        users.add(new Usuario("nome0"));
        users.add(new Usuario("nome1"));
        users.add(new Usuario("nome2"));

        Boolean resultado = users.contains(new Usuario("nome2"));
        System.out.println(resultado);
        // Se você comentar o hashcode da classes usuário, o resultado retornara falso, 
        //porque como o contains vai utilizar o equals e o equals usa o HASHCODE, com isso ira retornar falso.
    }
}
