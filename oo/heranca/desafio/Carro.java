package oo.heranca.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    public int velocidadeInicial = 0;
    private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if (velocidadeInicial + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeInicial = VELOCIDADE_MAXIMA;
        }else{
            velocidadeInicial += getDelta();
        }
    }

    public void frear(){
        if (this.velocidadeInicial >= 5) {
            this.velocidadeInicial -= 5;            
        }else{
            this.velocidadeInicial = 0;
        }
    }

    public int getDelta(){
        return delta;
    }

    public void setDelta(int delta){
        this.delta = delta;
    }
}
