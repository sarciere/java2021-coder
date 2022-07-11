package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    Ana sogra = new Ana();

    void TesteAcesso(){
        // Julia só tera acesso a idade, porque é a unica propriedade visivel para ela;
        System.out.println(sogra.idade);
        // System.out.println(sogra.facoDentroDeCasa);
        // System.out.println(sogra.segredo);
        // System.out.println(sogra.marcaNascenca);
    }
}
