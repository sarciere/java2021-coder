package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;

    protected Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        idade = Math.abs(idade);
        if (idade >= 0 && idade <= 120) {            
            this.idade = idade;
        }        
    }

    @Override
    public String toString() {
        return String.format("Meu nome é %s e tenho %d anos", this.nome, this.idade);
    }
}
