package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Sergio", 28);    
        
        System.out.println(p1.getNome());
        System.out.println(p1);
        System.out.println(p1.toString());
    }
    
}
