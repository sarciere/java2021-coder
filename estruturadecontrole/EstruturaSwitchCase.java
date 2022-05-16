package estruturadecontrole;

public class EstruturaSwitchCase {
    public static void main(String[] args) {
        String faixa = "Verde";
        switch (faixa.toLowerCase()) {
            case "verde": case "amarela": //essa forma é quando um retorno seja comum para dois ou mais cases
                System.out.println("Faixa verde/amarela");
                break;        
            default:
                System.out.println("Nenhuma faixa identificada");
                break;
        }
    }
}
