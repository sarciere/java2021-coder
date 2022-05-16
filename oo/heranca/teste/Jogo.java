package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Heroi hero  = new Heroi();
        Monstro monster = new Monstro();
                
        hero.x = 10;
        hero.y = 10;

        monster.x = 10;
        monster.y = 11;

        hero.atacar(monster);

        System.out.println(monster.vida);
        
    }
}
