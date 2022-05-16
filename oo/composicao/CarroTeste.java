package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro car = new Carro();

        if (!car.estaLigado()) {
            car.ligar();
        }
        car.acelerar();
        car.frear();
        car.desligar();
        car.motor.giros();
    }
}
