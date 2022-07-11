package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void TesteAcessos(){
        //Como Pedro herda de ana, os dados não precisam ser estanciados para o acesso, pois não é por composição;
        System.out.println(idade); // Tem o acesso, pois é publico;
        // System.out.println(facoDentroDeCasa); // Não tem acesso pois não esta no mesmo pacote;
        System.out.println(marcaNascenca); // Tem acesso pois é uma propriedade protected, que é passado por herança
    }
}
