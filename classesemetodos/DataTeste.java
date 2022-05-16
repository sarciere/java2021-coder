package classesemetodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = "15";
        d1.mes = "02";
        d1.ano = "1993";

        Data d2 = new Data();
        d2.dia = "02";
        d2.mes = "07";
        d2.ano = "1965"; 

        System.out.printf("A minha data de nascimento é %s\n", d1.obterDataFormatada());        
        System.out.printf("A data de nascimento da minha mãe é %s\n", d2.obterDataFormatada());
        
    }
    
}
