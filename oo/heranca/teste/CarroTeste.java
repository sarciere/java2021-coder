package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Civic civic = new Civic(220);
        Ferrari ferrari = new Ferrari(330);

        System.out.println("ACELERANDO O CIVIC");
        System.out.println(civic.velocidadeInicial);
        civic.acelerar();
        civic.acelerar();
        System.out.println(civic.velocidadeInicial);
        civic.frear();        
        System.out.println(civic.velocidadeInicial);
        System.out.println();

        System.out.println("ACELERANDO A FERRARI");
        System.out.println(ferrari.velocidadeInicial);
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeInicial);
        ferrari.frear();        
        System.out.println(ferrari.velocidadeInicial);
    }
}
