package oo.encapsulamento.casaA;

public class Ana {
    @SuppressWarnings("unused") //Suprime atributos que não estao sendo usados
    private String segredo = "/";
    protected int marcaNascenca; //  Transmintido por herança
    public int idade;
    String facoDentroDeCasa = "...";    //default ou pacote
}
