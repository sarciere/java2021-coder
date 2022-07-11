    package oo.heranca.desafio;



public class Ferrari extends Carro implements Esportivo, Luxo{
    public boolean ligarAr;
    public boolean ligarTurbo;

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void acelerar(){
        this.velocidadeInicial += 15;
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        }else if (!ligarTurbo && !ligarAr) {
            return 20;
        }else{
            return 15;
        }
    }
}
