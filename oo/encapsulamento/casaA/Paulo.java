package oo.encapsulamento.casaA;

public class Paulo {
    Ana espossa = new Ana();
    
    void TesteAcesso(){
        System.out.println(espossa.facoDentroDeCasa);
        System.out.println(espossa.idade);
        System.out.println(espossa.marcaNascenca);        
        // System.out.println(espossa.segredo); Segredo não pode ser acessado, porque é uma propriedade somente de Ana
    }
}
