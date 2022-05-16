package classesemetodos;

public class Data {

    String dia;
    String mes;
    String ano;

    String obterDataFormatada(){
        return String.format("%s/%s/%s", dia, mes, ano);
    }
}
